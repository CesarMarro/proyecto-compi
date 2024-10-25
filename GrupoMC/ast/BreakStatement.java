package ast;

public class BreakStatement extends Statement {

    public BreakStatement() {
    }

    @Override
    public void print(String indent) {
        printIndent(indent);
        System.out.println("BreakStatement");
    }
}
