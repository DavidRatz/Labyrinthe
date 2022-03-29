package model.chateau;

import model.labyrinthe.LabyrintheElementAbstract;
import model.labyrinthe.LabyrinthePosition;
import model.labyrinthe.LabyrintheVisitor;
import model.labyrinthe.Piece;

public class ChateauPiece extends LabyrintheElementAbstract implements Piece {

    @Override
    public String getDescription() {
        // TODO Auto-generated method stub
        return "Piece du chateau";
    }

    @Override
    public String toString() {
        return "P";
    }

    @Override
    public void accept(LabyrintheVisitor visitor) {
        // TODO Auto-generated method stub
        visitor.visit(this);
    }

    
    
}
