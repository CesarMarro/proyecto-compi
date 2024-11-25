package ast;

import semantic.ASTVisitor;

public abstract class Location extends Expression {
    public abstract void accept(ASTVisitor visitor);
}
