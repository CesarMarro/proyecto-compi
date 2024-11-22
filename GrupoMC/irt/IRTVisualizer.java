package irt;

import java.io.FileWriter;
import java.io.IOException;

public class IRTVisualizer {
    public void visualize(IRTNode root, String fileName) throws IOException {
        FileWriter writer = new FileWriter(fileName);
        writer.write("digraph IRT {\n");
        writer.write(root.toDot());
        writer.write("}\n");
        writer.close();
    }
}