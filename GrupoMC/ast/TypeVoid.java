package ast;

public class TypeVoid extends Type {
    @Override
    public void print(String indent) {
        printIndent(indent);
        System.out.println("Type: void");
    }
}
