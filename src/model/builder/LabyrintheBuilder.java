package model.builder;

import factory.LabyrintheFactory;
import model.labyrinthe.Labyrinthe;

public interface LabyrintheBuilder {
    void begin(int nbLine, int nbColumn, LabyrintheFactory factory);
    void addMur(int lig, int col);
    void addPorte(int lig, int col);
    void addPiece(int lig, int col);
    void setEntry(int lig, int col);
    void end();
    Labyrinthe getLabyrinthe();
}
