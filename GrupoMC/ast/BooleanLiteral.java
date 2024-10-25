package ast;

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
}
