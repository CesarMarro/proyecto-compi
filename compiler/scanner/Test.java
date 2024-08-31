package scanner;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {

    public static void main(String[] args) {
        try {
            Path path = Paths.get("C:/Users/Checha/Escritorio/Compilador/compiler/scanner/texto.txt");
            String ruta = path.toAbsolutePath().toString();
            System.out.println(ruta);
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
                System.out.println(tokens + ": " + lex.yytext());
            }

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();  
        } catch (Exception ex) {
            ex.printStackTrace();  
        }
    }
}
