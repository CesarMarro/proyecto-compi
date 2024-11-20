package irt;

import java.util.ArrayList;
import java.util.List;

public class CodeGenerator {
    private List<String> code;
    private int tempCounter;
    private String lastTemp;

    public CodeGenerator() {
        code = new ArrayList<>();
        tempCounter = 0;
        lastTemp = "";
    }

    public String newTemp() {
        return "t" + (tempCounter++);
    }

    public void emit(String instruction) {
        code.add(instruction);
    }

    public List<String> getCode() {
        return code;
    }

    public void setLastTemp(String temp) {
        lastTemp = temp;
    }

    public String getLastTemp() {
        return lastTemp;
    }
}