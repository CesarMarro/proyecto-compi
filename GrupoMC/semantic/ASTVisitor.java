package semantic;

import ast.*;

public interface ASTVisitor {
    void visit(Program program);
    void visit(FieldDecl fieldDecl);
    void visit(MethodDecl methodDecl);
    void visit(VarDecl varDecl);
    void visit(Param param);
    void visit(Block block);
    void visit(AssignStatement assignStmt);
    void visit(ReturnStatement returnStmt);
    void visit(MethodCallStatement methodCallStmt);
    void visit(MethodCall methodCall);
    void visit(IfStatement ifStmt);
    void visit(ForStatement forStmt);
    void visit(BooleanLiteral boolLiteral);
    void visit(IntLiteral intLiteral);
    void visit(CharLiteral charLiteral);
    void visit(StringLiteral stringLiteral);
    void visit(VariableLocation varLocation);
    void visit(ArrayLocation arrayLocation);
    void visit(ContinueStatement continueStmt);
    void visit(BreakStatement breakStmt);
    void visit(BinaryOpExpression binaryOpExpr);
    void visit(TypeVoid typeVoid);
    // Agrega métodos visit para cualquier otro tipo de nodo que tengas
}
