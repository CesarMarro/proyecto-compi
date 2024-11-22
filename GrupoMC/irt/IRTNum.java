package irt;

public class IRTNum extends IRTNode {
    private int value;

    public IRTNum(int value) {
        this.value = value;
    }

    @Override
    public String toDot() {
        return "\"" + hashCode() + "\" [label=\"" + value + "\"];\n";
    }

    @Override
    public String toStringIndented(String indent) {
        return indent + "Num: " + value + "\n";
    }
}
