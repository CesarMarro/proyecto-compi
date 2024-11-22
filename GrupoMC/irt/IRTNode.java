package irt;

public abstract class IRTNode {
    //public abstract String toString(); // Para depuración
    public abstract String toDot();   // Para visualización con Graphviz
    public abstract String toStringIndented(String indent);
}