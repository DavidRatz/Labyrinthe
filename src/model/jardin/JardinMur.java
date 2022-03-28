package model.jardin;

import model.labyrinthe.LabyrintheElementAbstract;
import model.labyrinthe.LabyrinthePosition;
import model.labyrinthe.Mur;

public class JardinMur extends LabyrintheElementAbstract implements Mur  {

    @Override
    public String getDescription() {
        // TODO Auto-generated method stub
        return "Mur du jardin";
    }
    
}
