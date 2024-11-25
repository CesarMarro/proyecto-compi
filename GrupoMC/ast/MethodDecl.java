package ast;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;

public class MethodDecl extends Declaration {
    private Type returnType;
    private String id;
    private ArrayList<Param> params;
    private Block block;

    public MethodDecl(Type returnType, String id, ArrayList<Param> params, Block block) {
        this.returnType = returnType;
        this.id = id;
        this.params = params;
        this.block = block;
    }

    public Type getReturnType() {
        return returnType;
    }

    public String getId() {
        return id;
    }

    public ArrayList<Param> getParams() {
        return params;
    }

    public Block getBlock() {
        return block;
    }

    @Override
    public void print(String indent) {
        printIndent(indent);
        System.out.println("MethodDecl: " + id);
        printIndent(indent + "  ");
        System.out.println("ReturnType:");
        returnType.print(indent + "    ");
        printIndent(indent + "  ");
        System.out.println("Parameters:");
        for (Param param : params) {
            param.print(indent + "    ");
        }
        printIndent(indent + "  ");
        System.out.println("Block:");
        block.print(indent + "    ");
    }
private HashMap<String, Method> methods = new HashMap<>();

}