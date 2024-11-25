package ast;

import semantic.ASTVisitor;

public abstract class Declaration extends ASTNode {
    public abstract void accept(ASTVisitor visitor);
}
