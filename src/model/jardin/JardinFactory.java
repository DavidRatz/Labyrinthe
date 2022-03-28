package model.jardin;

import factory.LabyrintheFactory;
import model.labyrinthe.Mur;
import model.labyrinthe.Piece;
import model.labyrinthe.Porte;

public class JardinFactory implements LabyrintheFactory {

    @Override
    public Mur createMur() {
        // TODO Auto-generated method stub
        return new JardinMur();
    }

    @Override
    public Piece createPiece() {
        // TODO Auto-generated method stub
        return new JardinPiece();
    }

    @Override
    public Porte createPorte() {
        // TODO Auto-generated method stub
        return new JardinPorte();
    }
    
}
