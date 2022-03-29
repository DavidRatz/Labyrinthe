package model.jardin;

import model.labyrinthe.LabyrintheElementAbstract;
import model.labyrinthe.LabyrinthePosition;
import model.labyrinthe.LabyrintheVisitor;
import model.labyrinthe.Porte;

public class JardinPorte extends LabyrintheElementAbstract implements Porte {

    @Override
    public String getDescription() {
        // TODO Auto-generated method stub
        return "Jardin porte";
    }

    @Override
    public void accept(LabyrintheVisitor visitor) {
        // TODO Auto-generated method stub
        visitor.visit(this);
    }
    
}
