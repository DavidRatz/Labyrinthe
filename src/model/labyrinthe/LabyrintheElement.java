package model.labyrinthe;

public interface LabyrintheElement{
    String getDescription();
    LabyrinthePosition getPosition();
    void setPosition(LabyrinthePosition position);
}