package ast;

import java.util.ArrayList;

public class Program extends ASTNode {
    private ArrayList<Declaration> declarations;

    public Program(ArrayList<Declaration> declarations) {
        this.declarations = declarations;
    }

    public ArrayList<Declaration> getDeclarations() {
        return declarations;
    }

    @Override
    public void print(String indent) {
        printIndent(indent);
        System.out.println("Program");
        for (Declaration decl : declarations) {
            decl.print(indent + "  ");
        }
    }
}
