package irt;

import java.util.List;

public class IRTProgram extends IRTNode {
    private List<IRTNode> declarations;

    public IRTProgram(List<IRTNode> declarations) {
        this.declarations = declarations;
    }

    @Override
    public String toDot() {
        StringBuilder sb = new StringBuilder();
        sb.append("\"").append(hashCode()).append("\" [label=\"Program\"];\n");
        for (IRTNode decl : declarations) {
            sb.append("\"").append(hashCode()).append("\" -> \"").append(decl.hashCode()).append("\";\n");
            sb.append(decl.toDot());
        }
        return sb.toString();
    }

    @Override
    public String toStringIndented(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("Program:\n");
        for (IRTNode decl : declarations) {
            sb.append(decl.toStringIndented(indent + "  "));
        }
        return sb.toString();
    }
}
