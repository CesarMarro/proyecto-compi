package ast;

public class IntType extends Type {
    @Override
    public void print(String indent) {
        printIndent(indent);
        System.out.println("Type: int");
    }
}
