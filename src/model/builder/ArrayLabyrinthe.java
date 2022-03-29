package model.builder;

import java.util.Arrays;

import model.labyrinthe.Direction;
import model.labyrinthe.Labyrinthe;
import model.labyrinthe.LabyrintheElement;
import model.labyrinthe.LabyrinthePosition;
import model.labyrinthe.LabyrinthePositionImpl;
import model.labyrinthe.LabyrintheVisitor;

public class ArrayLabyrinthe implements Labyrinthe {

    private LabyrintheElement[][] grille;
    private LabyrinthePositionImpl positionEntree = null;

    public ArrayLabyrinthe(int nbLine, int nbColumn){
        grille = new LabyrintheElement[nbLine][nbColumn];
        positionEntree = new LabyrinthePositionImpl(0,0);
    }

    public LabyrintheElement[][] getGrille() {
        return grille;
    }

    void addElement(LabyrintheElement element, int line, int column){
        grille[line][column] = element;
        element.setPosition(new LabyrinthePositionImpl(line,column));
    }

    void setEntry(int line, int column){
        positionEntree = new LabyrinthePositionImpl(line, column);
    }

    @Override
    public LabyrintheElement getEntry() {
        return grille[positionEntree.getLine()][positionEntree.getColumn()];
    }

    @Override
    public LabyrintheElement getNeighbourElement(LabyrintheElement element, Direction direction) {
        LabyrinthePosition position = element.getPosition().getPositionByDirection(direction);
        return grille[position.getLine()][position.getColumn()];
    }

    // @Override
    // public void accept(LabyrintheVisitor visitor) {
    //     // TODO Auto-generated method stub
    //     visitor.visit(this);
    // }
}
