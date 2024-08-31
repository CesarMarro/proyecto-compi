package compiler;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.nio.file.Path;
import java.nio.file.Paths;
import scanner.Lexer; // Import the Lexer class from the scanner package

public class Compiler {

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java Compiler <filename> -target <target>");
            return;
        }

        String filename = args[0];
        String target = args[1];

        if (!"-target".equals(target) || args.length < 3) {
            System.out.println("Usage: java Compiler <filename> -target <target>");
            return;
        }

        String targetType = args[2];

        if ("default".equals(targetType)) {
            runScanner(filename);
        } else {
            System.out.println("Unsupported target: " + targetType);
        }
    }

    private static void runScanner(String filename) {
        try {
            Path path = Paths.get(filename);
            String ruta = path.toAbsolutePath().toString();
            System.out.println("Path: " + ruta);
            Reader obj = new BufferedReader(new FileReader(ruta));
            Lexer lex = new Lexer(obj);

            while (true) {
                String tokens;
                try {
                    tokens = lex.yylex().toString();
                    if (tokens == null) {
                        System.out.println("FINAL");
                        return;
                    }
                } catch (Exception e) {
                    System.out.println("ERROR: " + e.getMessage());
                    e.printStackTrace();
                    return;
                }

                // Assuming `Lexer` has methods to get the line and column numbers
                int tokenLine = lex.getLineNumber(); // Implement this method in your Lexer
                int tokenColumn = lex.getColumnNumber(); 
                
          
                System.out.println(String.format("Token: %s, Line: %d, Column: %d, Text: %s", 
                    tokens, tokenLine, tokenColumn, lex.yytext()));
            }

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();  
        } catch (Exception ex) {
            ex.printStackTrace();  
        }
    }
}
