package ast;

import semantic.ASTVisitor;

public class IntType extends Type {
    @Override
    public void print(String indent) {
        printIndent(indent);
        System.out.println("Type: int");
    }

    @Override
    public void accept(ASTVisitor visitor) {
        // Los tipos pueden no necesitar ser visitados, dependiendo de la implementación
    }
}
