package ast;

public class BooleanType extends Type {
    @Override
    public void print(String indent) {
        printIndent(indent);
        System.out.println("Type: boolean");
    }
}
