package ast;

import semantic.ASTVisitor;

public abstract class Expression extends ASTNode {
    public abstract void accept(ASTVisitor visitor);
}
