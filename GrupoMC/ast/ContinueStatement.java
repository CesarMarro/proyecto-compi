package ast;

public class ContinueStatement extends Statement {

    public ContinueStatement() {
    }

    @Override
    public void print(String indent) {
        printIndent(indent);
        System.out.println("ContinueStatement");
    }
}
