package ast;

import semantic.ASTVisitor;

public class CharLiteral extends Literal {
    private char value;

    public CharLiteral(char value) {
        this.value = value;
    }

    public char getValue() {
        return value;
    }

    @Override
    public void print(String indent) {
        printIndent(indent);
        System.out.println("CharLiteral: '" + value + "'");
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
