package ast;

import semantic.ASTVisitor;

public class StringLiteral extends Literal {
    private String value;

    public StringLiteral(String value) {
        // Eliminar las comillas al inicio y al final
        this.value = value.substring(1, value.length() - 1);
    }

    public String getValue() {
        return value;
    }

    @Override
    public void print(String indent) {
        printIndent(indent);
        System.out.println("StringLiteral: \"" + value + "\"");
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
