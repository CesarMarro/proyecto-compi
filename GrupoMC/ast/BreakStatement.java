package ast;

import semantic.ASTVisitor;

public class BreakStatement extends Statement {

    public BreakStatement() {
    }

    @Override
    public void print(String indent) {
        printIndent(indent);
        System.out.println("BreakStatement");
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
