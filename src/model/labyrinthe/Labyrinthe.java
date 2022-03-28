package model.labyrinthe;

public interface Labyrinthe {
    LabyrintheElement getEntry();
    LabyrintheElement getNeighbourElement(LabyrintheElement element, Direction direction);
}
