package ast;

import semantic.ASTVisitor;

public class TypeVoid extends Type {
    @Override
    public void print(String indent) {
        printIndent(indent);
        System.out.println("Type: void");
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
