package parser;

import java.util.List;
import java.util.ArrayList;

public class StmtList {
    public List<Stmt> stmts;

    public StmtList() {
        this.stmts = new ArrayList<>();
    }

    public void addStmt(Stmt stmt) {
        stmts.add(stmt);
    }

    @Override
    public String toString() {
        return "StmtList: " + stmts.toString();
    }
}
