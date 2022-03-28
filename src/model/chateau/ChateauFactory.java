package model.chateau;

import factory.LabyrintheFactory;
import model.labyrinthe.Mur;
import model.labyrinthe.Piece;
import model.labyrinthe.Porte;

public class ChateauFactory implements LabyrintheFactory {

    @Override
    public Mur createMur() {
        // TODO Auto-generated method stub
        return new ChateauMur();
    }

    @Override
    public Piece createPiece() {
        // TODO Auto-generated method stub
        return new ChateauPiece();
    }

    @Override
    public Porte createPorte() {
        // TODO Auto-generated method stub
        return new ChateauPorte();
    }
    
}
