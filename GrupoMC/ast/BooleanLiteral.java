package ast;

import semantic.ASTVisitor;

public class BooleanLiteral extends Literal {
    private boolean value;

    public BooleanLiteral(boolean value) {
        this.value = value;
    }

    public boolean isValue() {
        return value;
    }

    @Override
    public void print(String indent) {
        printIndent(indent);
        System.out.println("BooleanLiteral: " + value);
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
