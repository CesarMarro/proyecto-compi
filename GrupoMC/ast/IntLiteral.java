package ast;

public class IntLiteral extends Literal {
    private int value;

    public IntLiteral(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public void print(String indent) {
        printIndent(indent);
        System.out.println("IntLiteral: " + value);
    }
}
