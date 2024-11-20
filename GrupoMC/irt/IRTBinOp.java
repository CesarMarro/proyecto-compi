package irt;

public class IRTBinOp extends IRTExpr {
    public String op;
    public IRTExpr left;
    public IRTExpr right;

    public IRTBinOp(String op, IRTExpr left, IRTExpr right) {
        this.op = op;
        this.left = left;
        this.right = right;
    }

    @Override
    public void generateCode(CodeGenerator gen) {
        left.generateCode(gen);
        String leftTemp = gen.getLastTemp();
        right.generateCode(gen);
        String rightTemp = gen.getLastTemp();
        String resultTemp = gen.newTemp();
        gen.emit(resultTemp + " = " + leftTemp + " " + op + " " + rightTemp);
        gen.setLastTemp(resultTemp);
    }
}