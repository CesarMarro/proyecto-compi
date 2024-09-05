package compiler;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.nio.file.Path;
import java.nio.file.Paths;

// Importar las clases necesarias desde el paquete scanner
import scanner.Lexer;


public class Compiler {

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java compiler.Compiler <filename> [-target <target>]");
            return;
        }

        String filename = args[0];
        String target = "scan";  // Default target

        // Verificar si se ha proporcionado la bandera -target
        if (args.length >= 3 && "-target".equals(args[1])) {
            target = args[2];
        }

        
        switch (target) {
            case "scan":
                runScanner(filename);
                break;
            default:
                System.out.println("Unknown target: " + target);
                break;
        }
    }

    private static void runScanner(String filename) {
        try {
            Path path = Paths.get("").toAbsolutePath().resolve(filename);
            String ruta = path.toString();
            System.out.println("Ruta absoluta: " + ruta);
            Reader obj = new BufferedReader(new FileReader(ruta));
            Lexer lex = new Lexer(obj);
        
            while (true) {
                String tokens;
                try {
                    tokens = lex.yylex().toString();  
                } catch (Exception e) {
                    System.out.println("FINAL");
                    return;
                }
                
                System.out.println(tokens + ": " + lex.yytext() + " at line " + lex.getLine() + ", column " + lex.getColumn());
            }
        
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }
}
