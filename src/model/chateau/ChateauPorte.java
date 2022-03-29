package model.chateau;

import model.labyrinthe.LabyrintheElementAbstract;
import model.labyrinthe.LabyrinthePosition;
import model.labyrinthe.LabyrintheVisitor;
import model.labyrinthe.Porte;

public class ChateauPorte extends LabyrintheElementAbstract implements Porte {

    @Override
    public String getDescription() {
        // TODO Auto-generated method stub
        return "Porte chateau";
    }

    @Override
    public String toString() {
        return "PO";
    }

    @Override
    public void accept(LabyrintheVisitor visitor) {
        // TODO Auto-generated method stub
        visitor.visit(this);
    }
    
}
