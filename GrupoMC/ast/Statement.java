package ast;

import semantic.ASTVisitor;

public abstract class Statement extends ASTNode {
    public abstract void accept(ASTVisitor visitor);
}
