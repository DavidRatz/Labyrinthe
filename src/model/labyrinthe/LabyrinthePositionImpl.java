package model.labyrinthe;

public class LabyrinthePositionImpl implements LabyrinthePosition {
    private final int ligne;
    private final int colonne;
    public LabyrinthePositionImpl(int ligne, int colonne) {
        this.ligne = ligne;
        this.colonne = colonne;
    }
    public int getLine() {
        return ligne;
    }

    public int getColumn() {
        return colonne;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + colonne;
        result = prime * result + ligne;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        LabyrinthePositionImpl other = (LabyrinthePositionImpl) obj;
        if (colonne != other.colonne)
            return false;
        if (ligne != other.ligne)
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "LabyrinthePositionImpl [colonne=" + colonne + ", ligne=" + ligne + "]";
    }

    @Override
    public LabyrinthePosition getPositionByDirection(Direction direction) {
        return switch (direction) {
            case NORD -> new LabyrinthePositionImpl(ligne-1, colonne);
            case EST -> new LabyrinthePositionImpl(ligne, colonne+1);
            case SUD -> new LabyrinthePositionImpl(ligne+1, colonne);
            case OUEST -> new LabyrinthePositionImpl(ligne, colonne-1);
        };
    }  
    
}
