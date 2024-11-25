package semantic;

import ast.*;
import java.util.ArrayList;
import java.util.List;

public class SemanticAnalyzer implements ASTVisitor {
    private SymbolTable symbolTable;
    private List<String> errors;
    private boolean insideLoop = false; // Variable para rastrear si estamos dentro de un bucle

    public SemanticAnalyzer() {
        symbolTable = new SymbolTable();
        errors = new ArrayList<>();
    }

    public List<String> getErrors() {
        return errors;
    }

    @Override
    public void visit(Program program) {
        // Registrar declaraciones (campos y métodos)
        for (Declaration decl : program.getDeclarations()) {
            decl.accept(this);
        }
    }

    @Override
    public void visit(FieldDecl fieldDecl) {
        Type type = fieldDecl.getType();
        for (VarDecl varDecl : fieldDecl.getVarDecls()) {
            // Si VarDecl no tiene Type asignado, asígnalo ahora
            if (varDecl.getType() == null) {
                varDecl.setType(type);
            }
            // Registrar el símbolo
            Symbol symbol = new Symbol(varDecl.getId(), varDecl.getType(), SymbolKind.VARIABLE);
            if (!symbolTable.addSymbol(symbol)) {
                errors.add("Error: Variable '" + varDecl.getId() + "' ya está declarada en el ámbito global.");
            }
            // Visitar la expresión de inicialización si existe
            if (varDecl.getInitExpr() != null) {
                varDecl.getInitExpr().accept(this);
            }
        }
    }

    @Override
    public void visit(MethodDecl methodDecl) {
        Type returnType = methodDecl.getReturnType();
        Symbol methodSymbol = new Symbol(methodDecl.getId(), returnType, SymbolKind.METHOD);
        if (!symbolTable.addSymbol(methodSymbol)) {
            errors.add("Error: Método '" + methodDecl.getId() + "' ya está declarado.");
        }

        // Entrar en el ámbito del método
        symbolTable.enterScope();

        // Registrar parámetros
        for (Param param : methodDecl.getParams()) {
            Symbol paramSymbol = new Symbol(param.getId(), param.getType(), SymbolKind.VARIABLE);
            if (!symbolTable.addSymbol(paramSymbol)) {
                errors.add("Error: Parámetro '" + param.getId() + "' ya está declarado en el método '" + methodDecl.getId() + "'.");
            }
        }

        // Visitar el bloque del método
        methodDecl.getBlock().accept(this);

        // Salir del ámbito del método
        symbolTable.exitScope();
    }

    @Override
    public void visit(VarDecl varDecl) {
        // Registrar la variable en el ámbito actual
        Symbol symbol = new Symbol(varDecl.getId(), varDecl.getType(), SymbolKind.VARIABLE);
        if (!symbolTable.addSymbol(symbol)) {
            errors.add("Error: Variable '" + varDecl.getId() + "' ya está declarada en el ámbito.");
        }

        // Visitar la expresión de inicialización si existe
        if (varDecl.getInitExpr() != null) {
            varDecl.getInitExpr().accept(this);
            // Aquí podrías agregar verificaciones de tipos más detalladas
        }
    }

    @Override
    public void visit(Param param) {
        // Los parámetros ya se registran en MethodDecl
    }

    @Override
    public void visit(Block block) {
        // Entrar en un nuevo ámbito
        symbolTable.enterScope();

        // Registrar declaraciones de variables
        for (VarDecl varDecl : block.getVarDecls()) {
            varDecl.accept(this);
        }

        // Visitar las sentencias
        for (Statement stmt : block.getStatements()) {
            stmt.accept(this);
        }

        // Salir del ámbito
        symbolTable.exitScope();
    }

    @Override
    public void visit(AssignStatement assignStmt) {
        // Verificar que la variable exista
        Symbol symbol = getSymbol(assignStmt.getLocation());
        if (symbol == null) {
            errors.add("Error: Variable '" + getLocationName(assignStmt.getLocation()) + "' no está declarada.");
        } else {
            // Visitar la expresión
            assignStmt.getExpression().accept(this);
            // Verificación básica de tipos (puede extenderse)
            // Por simplicidad, se asume que los tipos coinciden
        }
    }

    @Override
    public void visit(ReturnStatement returnStmt) {
        if (returnStmt.getExpression() != null) {
            returnStmt.getExpression().accept(this);
            // Verificación de tipo de retorno (puede extenderse)
            // Por simplicidad, se asume que los tipos coinciden
        }
    }

    @Override
    public void visit(MethodCall methodCall) {
        Symbol methodSymbol = symbolTable.lookup(methodCall.getId());
        if (methodSymbol == null) {
            errors.add("Error: Método '" + methodCall.getId() + "' no está declarado.");
            return;
        }
        if (methodSymbol.getKind() != SymbolKind.METHOD) {
            errors.add("Error: '" + methodCall.getId() + "' no es un método.");
            return;
        }
        // Para simplificar, no se verifica el número y tipos de argumentos
        for (Expression arg : methodCall.getArguments()) {
            arg.accept(this);
        }
    }

    @Override
    public void visit(MethodCallStatement methodCallStmt) {
        methodCallStmt.getMethodCall().accept(this);
    }

    @Override
    public void visit(IfStatement ifStmt) {
        // Verificar la condición
        ifStmt.getCondition().accept(this);
        // Verificar la sentencia 'then'
        ifStmt.getThenStmt().accept(this);
        // Verificar la sentencia 'else' si existe
        if (ifStmt.getElseStmt() != null) {
            ifStmt.getElseStmt().accept(this);
        }
    }

    @Override
    public void visit(ForStatement forStmt) {
        // Entrar en un nuevo ámbito para el for
        symbolTable.enterScope();

        // Registrar la variable del for
        Symbol symbol = symbolTable.lookup(forStmt.getId());
        if (symbol == null) {
            errors.add("Error: Variable '" + forStmt.getId() + "' no está declarada en el for.");
        }

        // Verificar las expresiones de inicialización, condición y actualización
        forStmt.getInitExpr().accept(this);
        forStmt.getConditionExpr().accept(this);
        forStmt.getUpdateExpr().accept(this);

        // Marcar que estamos dentro de un bucle
        boolean previousInsideLoop = insideLoop;
        insideLoop = true;

        // Verificar el cuerpo del for
        forStmt.getBody().accept(this);

        // Restaurar el estado anterior de insideLoop
        insideLoop = previousInsideLoop;

        // Salir del ámbito del for
        symbolTable.exitScope();
    }

    @Override
    public void visit(ContinueStatement continueStmt) {
        if (!insideLoop) {
            errors.add("Error: 'continue' fuera de un bucle.");
        }
        // No se requiere acción adicional si está dentro de un bucle
    }

    @Override
    public void visit(BreakStatement breakStmt) {
        if (!insideLoop) {
            errors.add("Error: 'break' fuera de un bucle.");
        }
        // No se requiere acción adicional si está dentro de un bucle
    }

    @Override
    public void visit(BinaryOpExpression binaryOpExpr) {
        // Visitar las expresiones izquierda y derecha
        binaryOpExpr.getLeft().accept(this);
        binaryOpExpr.getRight().accept(this);

        // Aquí podrías agregar verificaciones de tipos según el operador
        // Por simplicidad, se asume que los tipos son correctos
    }

    @Override
    public void visit(TypeVoid typeVoid) {
        // No se requiere acción adicional para TypeVoid en este análisis básico
    }

    @Override
    public void visit(BooleanLiteral boolLiteral) {
        // No se requiere acción adicional
    }

    @Override
    public void visit(IntLiteral intLiteral) {
        // No se requiere acción adicional
    }

    @Override
    public void visit(CharLiteral charLiteral) {
        // No se requiere acción adicional
    }

    @Override
    public void visit(StringLiteral stringLiteral) {
        // No se requiere acción adicional
    }

    @Override
    public void visit(VariableLocation varLocation) {
        Symbol symbol = symbolTable.lookup(varLocation.getId());
        if (symbol == null) {
            errors.add("Error: Variable '" + varLocation.getId() + "' no está declarada.");
        }
    }

    @Override
    public void visit(ArrayLocation arrayLocation) {
        Symbol symbol = symbolTable.lookup(arrayLocation.getId());
        if (symbol == null) {
            errors.add("Error: Arreglo '" + arrayLocation.getId() + "' no está declarado.");
        }
        // Visitar el índice
        arrayLocation.getIndex().accept(this);
    }

    // Métodos adicionales para manejar otros nodos si es necesario

    private Symbol getSymbol(Location location) {
        if (location instanceof VariableLocation) {
            return symbolTable.lookup(((VariableLocation) location).getId());
        } else if (location instanceof ArrayLocation) {
            return symbolTable.lookup(((ArrayLocation) location).getId());
        }
        return null;
    }

    private String getLocationName(Location location) {
        if (location instanceof VariableLocation) {
            return ((VariableLocation) location).getId();
        } else if (location instanceof ArrayLocation) {
            return ((ArrayLocation) location).getId();
        }
        return "unknown";
    }
}
