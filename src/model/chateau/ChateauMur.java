package model.chateau;

import model.labyrinthe.LabyrintheElementAbstract;
import model.labyrinthe.LabyrinthePosition;
import model.labyrinthe.LabyrintheVisitor;
import model.labyrinthe.Mur;

public class ChateauMur extends LabyrintheElementAbstract implements Mur {

    @Override
    public String getDescription() {
        // TODO Auto-generated method stub
        return "Mur du chateau";
    }

    @Override
    public String toString() {
        return "M";
    }

    @Override
    public void accept(LabyrintheVisitor visitor) {
        // TODO Auto-generated method stub
        visitor.visit(this);
    }

    
    
}
