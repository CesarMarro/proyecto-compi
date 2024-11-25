package ast;

import semantic.ASTVisitor;

public class ContinueStatement extends Statement {

    public ContinueStatement() {
    }

    @Override
    public void print(String indent) {
        printIndent(indent);
        System.out.println("ContinueStatement");
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
