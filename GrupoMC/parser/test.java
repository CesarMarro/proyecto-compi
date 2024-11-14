package parser;

import java.io.FileReader;
import java_cup.runtime.Symbol;
import ast.*;

public class test {
    public static void main(String[] args) {
        try {
            // Ruta al archivo de prueba
            // Asegúrate de que esta ruta apunta al archivo de prueba que deseas analizar
            FileReader fileReader = new FileReader("C:\\Users\\Javier C\\OneDrive - Universidad Francisco Marroquin\\Clases\\Sistemas operativos\\Proyecto-Compi\\proyecto-compi\\GrupoMC\\test.txt");

            // Crear una instancia del lexer
            LexerParser lexer = new LexerParser(fileReader);

            // Crear una instancia del parser
            parser parser = new parser(lexer);

            // Parsear la entrada y obtener la raíz del AST
            Symbol parseResult = parser.parse();
            Program astRoot = (Program) parseResult.value;

            // Imprimir el AST
            System.out.println("Parsing completado.");
            astRoot.print("");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
