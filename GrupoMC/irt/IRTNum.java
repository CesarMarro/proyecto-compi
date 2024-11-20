package irt;

public class IRTNum extends IRTExpr {
    public double value;

    public IRTNum(double value) {
        this.value = value;
    }

    @Override
    public void generateCode(CodeGenerator gen) {
        String temp = gen.newTemp();
        gen.emit(temp + " = " + value);
        gen.setLastTemp(temp);
    }
}