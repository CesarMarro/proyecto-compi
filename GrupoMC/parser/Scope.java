package parser;

import java.util.HashMap;
import java.util.Map;

import ast.Type;

public class Scope {
    private Map<String, String> symbols;
    private Scope parent;

    public Scope(Scope parent) {
        this.symbols = new HashMap<>();
        this.parent = parent;
    }

    // public boolean insert(String name, String paramType) {
    //     if (symbols.containsKey(name)) {
    //         return false; // Symbol already declared in current scope
    //     }
    //     symbols.put(name, paramType);
    //     return true;
    // }

    public boolean insert(String name, String type) {
        if (symbols.containsKey(name)) {
            System.out.println("Insert: Symbol '" + name + "' already exists in current scope.");
            return false;
        }
        symbols.put(name, type);
        System.out.println("Insert: Symbol '" + name + "' of type '" + type + "' added to scope.");
        return true;
    }

    public boolean lookup(String name) {
        System.out.println("Lookup: Attempting to find '" + name + "' in scope.");
        if (symbols.containsKey(name)) {
            System.out.println("Lookup: Symbol '" + name + "' found in current scope.");
            return true; // Found in current scope
        } else if (parent != null) {
            System.out.println("Lookup: Symbol '" + name + "' not found in current scope, checking parent.");
            return parent.lookup(name); // Recurse to parent scope
        }
        System.out.println("Lookup: Symbol '" + name + "' not found in any scope.");
        return false; // Not found in any scope
    }



    public Scope getParent() {
        return parent;
    }
}