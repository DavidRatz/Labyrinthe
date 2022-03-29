package model.labyrinthe;

public interface Labyrinthe {
    LabyrintheElement[][] getGrille();
    LabyrintheElement getEntry();
    LabyrintheElement getNeighbourElement(LabyrintheElement element, Direction direction);
    // public void accept(LabyrintheVisitor visitor);
}
