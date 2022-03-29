package model.labyrinthe;

public interface LabyrintheVisitor {
    void visit(Mur mur);
    void visit(Piece piece);
    void visit(Porte porte);
}
