package ast;

import java.util.ArrayList;
import parser.SymbolTable;

public class Block extends Statement {
    private ArrayList<VarDecl> varDecls;
    private ArrayList<Statement> statements;
    private SymbolTable symbolTable;

    public Block(ArrayList<VarDecl> varDecls, ArrayList<Statement> statements, SymbolTable symbolTable) {
        this.varDecls = varDecls;
        this.statements = statements;
        this.symbolTable = symbolTable;

        // Enter a new scope when creating a Block
        this.symbolTable.enterScope();

        // Insert variable declarations into the symbol table
        for (VarDecl varDecl : varDecls) {
            String varName = varDecl.getId();
            String varType = varDecl.getTypeName(); // Assuming VarDecl has a method to get the type name
            if (!this.symbolTable.insert(varName, varType)) {
                System.err.println("Semantic Error: Variable '" + varName + "' is already declared in the current scope.");
            }
        }
    }

    public ArrayList<VarDecl> getVarDecls() {
        return varDecls;
    }

    public ArrayList<Statement> getStatements() {
        return statements;
    }

    public void processBlock() {
        // Process statements within the block
        for (Statement stmt : statements) {
            stmt.process(); // Assuming Statement class has a process() method
        }

        // Exit the scope after processing the block
        this.symbolTable.exitScope();
    }

    @Override
    public void print(String indent) {
        printIndent(indent);
        System.out.println("Block");
        if (!varDecls.isEmpty()) {
            printIndent(indent + "  ");
            System.out.println("Variable Declarations:");
            for (VarDecl varDecl : varDecls) {
                varDecl.print(indent + "    ");
            }
        }
        if (!statements.isEmpty()) {
            printIndent(indent + "  ");
            System.out.println("Statements:");
            for (Statement stmt : statements) {
                stmt.print(indent + "    ");
            }
        }
    }
}
