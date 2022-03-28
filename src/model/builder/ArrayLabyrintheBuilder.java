package model.builder;

import factory.LabyrintheFactory;
import model.labyrinthe.Direction;
import model.labyrinthe.Labyrinthe;
import model.labyrinthe.LabyrintheElement;

public class ArrayLabyrintheBuilder implements LabyrintheBuilder {
    ArrayLabyrinthe labyrinthe;
    private LabyrintheFactory factory;
    @Override
    public void begin(int nbLine, int nbColumn, LabyrintheFactory factory) {
        // TODO Auto-generated method stub
        labyrinthe = new ArrayLabyrinthe(nbLine, nbColumn);
        labyrinthe.setEntry(0, 0);
        this.factory = factory;
    }

    @Override
    public void addMur(int lig, int col) {
        // TODO Auto-generated method stub
        labyrinthe.addElement(factory.createMur(), lig,col);
    }

    @Override
    public void addPorte(int lig, int col) {
        // TODO Auto-generated method stub
        labyrinthe.addElement(factory.createPorte(), lig,col);
    }

    @Override
    public void addPiece(int lig, int col) {
        // TODO Auto-generated method stub
        labyrinthe.addElement(factory.createPiece(), lig,col);
    }

    @Override
    public void end() {
        // TODO Auto-generated method stub
        factory = null;
    }

    @Override
    public Labyrinthe getLabyrinthe() {
        // TODO Auto-generated method stub
        return labyrinthe;
    }

    
    
}
