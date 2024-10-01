package parser;

public class Program {
    public StmtList stmtList;

    public Program(StmtList stmtList) {
        this.stmtList = stmtList;
    }

    @Override
    public String toString() {
        return "Program: " + stmtList.toString();
    }
}