package model;

import model.labyrinthe.Direction;
import model.labyrinthe.Labyrinthe;
import model.labyrinthe.LabyrintheElement;
import model.labyrinthe.LabyrinthePositionImpl;
import model.labyrinthe.LabyrintheVisitor;
import model.labyrinthe.Mur;
import model.labyrinthe.Piece;
import model.labyrinthe.Porte;

public class Joueur implements LabyrintheVisitor {

    Labyrinthe labyrinthe;
    LabyrintheElement state;

    public Joueur(Labyrinthe labyrinthe) {
        this.labyrinthe = labyrinthe;
        state = labyrinthe.getEntry();
    }

    @Override
    public void visit(Mur mur) {
        System.out.println("Aie");        
    }

    @Override
    public void visit(Piece piece) {
        System.out.println("Je marche...");
        state = piece;
    }

    @Override
    public void visit(Porte porte) {
        state = porte;
        System.out.println("Gagné");
    }

    public void move(Direction playerDirection) {
        LabyrintheElement element = labyrinthe.getNeighbourElement(state, playerDirection);
        element.accept(this);
    }

    public boolean isFinish() {
        return state instanceof Porte;
    }
    
}
