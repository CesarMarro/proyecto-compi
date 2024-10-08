package parser;

import java.io.FileReader;
import java.io.InputStreamReader;
import java_cup.runtime.Symbol;

public class test {
    public static void main(String[] args) {
        try {
            // Provide the path to your test file here
            FileReader fileReader = new FileReader("C:/Users/Checha/Escritorio/GitHub/compi/GrupoMC/test.txt");
            
            // Create a Lexer instance
            Lexer lexer = new Lexer(fileReader);
            
            // Create a Parser instance
            parser parser = new parser(lexer);
            
            // Parse the input
            Symbol parseResult = parser.parse();
            
            // Optionally print the result (for debugging purposes)
            System.out.println("Parsing completed.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
