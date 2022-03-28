package factory;

import model.*;
import model.labyrinthe.Mur;
import model.labyrinthe.Piece;
import model.labyrinthe.Porte;

public interface LabyrintheFactory{
    Mur createMur();
    Piece createPiece();
    Porte createPorte();
}