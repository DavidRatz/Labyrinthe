package model.labyrinthe;

public interface LabyrinthePosition {
    LabyrinthePosition getPositionByDirection(Direction direction);
    public int getLine();

    public int getColumn();
}
