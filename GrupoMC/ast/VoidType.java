package ast;

import semantic.ASTVisitor;

public class VoidType extends Type {
    @Override
    public String toString() {
        return "void";
    }

    @Override
    public void print(String indent) {
        printIndent(indent);
        System.out.println("Type: void");
    }

    @Override
    public void accept(ASTVisitor visitor) {
        // Los tipos pueden no necesitar ser visitados, dependiendo de la implementación
    }
}
