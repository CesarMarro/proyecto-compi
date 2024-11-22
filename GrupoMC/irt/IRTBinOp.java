package irt;

public class IRTBinOp extends IRTNode {
    public enum BinOpType { ADD, SUB, MUL, DIV }
    private BinOpType type;
    private IRTNode left;
    private IRTNode right;

    public IRTBinOp(BinOpType type, IRTNode left, IRTNode right) {
        this.type = type;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toDot() {
        StringBuilder sb = new StringBuilder();
        sb.append("\"").append(hashCode()).append("\" [label=\"").append(type).append("\"];\n");
        sb.append("\"").append(hashCode()).append("\" -> \"").append(left.hashCode()).append("\";\n");
        sb.append(left.toDot());
        sb.append("\"").append(hashCode()).append("\" -> \"").append(right.hashCode()).append("\";\n");
        sb.append(right.toDot());
        return sb.toString();
    }

    @Override
    public String toStringIndented(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("BinOp: ").append(type).append("\n");
        sb.append(left.toStringIndented(indent + "  "));
        sb.append(right.toStringIndented(indent + "  "));
        return sb.toString();
    }
}
