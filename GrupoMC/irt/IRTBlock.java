package irt;

import java.util.List;

public class IRTBlock extends IRTNode {
    private List<IRTNode> statements;

    public IRTBlock(List<IRTNode> statements) {
        this.statements = statements;
    }

    @Override
    public String toDot() {
        StringBuilder sb = new StringBuilder();
        sb.append("\"").append(hashCode()).append("\" [label=\"Block\"];\n");
        for (IRTNode stmt : statements) {
            sb.append("\"").append(hashCode()).append("\" -> \"").append(stmt.hashCode()).append("\";\n");
            sb.append(stmt.toDot());
        }
        return sb.toString();
    }

    @Override
    public String toStringIndented(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("Block:\n");
        for (IRTNode stmt : statements) {
            sb.append(stmt.toStringIndented(indent + "  "));
        }
        return sb.toString();
    }
}