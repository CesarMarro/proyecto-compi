package ast;

import semantic.ASTVisitor;
import java.util.ArrayList;

public class Block extends Statement {
    private ArrayList<VarDecl> varDecls;
    private ArrayList<Statement> statements;

    public Block(ArrayList<VarDecl> varDecls, ArrayList<Statement> statements) {
        this.varDecls = varDecls;
        this.statements = statements;
    }

    public ArrayList<VarDecl> getVarDecls() {
        return varDecls;
    }

    public ArrayList<Statement> getStatements() {
        return statements;
    }

    @Override
    public void print(String indent) {
        printIndent(indent);
        System.out.println("Block");
        if (!varDecls.isEmpty()) {
            printIndent(indent + "  ");
            System.out.println("Variable Declarations:");
            for (VarDecl varDecl : varDecls) {
                varDecl.print(indent + "    ");
            }
        }
        if (!statements.isEmpty()) {
            printIndent(indent + "  ");
            System.out.println("Statements:");
            for (Statement stmt : statements) {
                stmt.print(indent + "    ");
            }
        }
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
