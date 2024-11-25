package ast;

import semantic.ASTVisitor;

public abstract class ASTNode {
    public abstract void print(String indent);
    
    // Método auxiliar para imprimir con indentación
    protected void printIndent(String indent) {
        System.out.print(indent);
    }
    
    // Método accept para el patrón Visitor
    public abstract void accept(ASTVisitor visitor);
}
