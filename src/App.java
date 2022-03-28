import factory.LabyrintheFactory;
import model.builder.ArrayLabyrintheBuilder;
import model.chateau.ChateauFactory;
import model.jardin.JardinFactory;
import model.labyrinthe.LabyrintheElement;

public class App {
    public static void main(String[] args) throws Exception {
        LabyrintheFactory factory = getFactory("Chateau");

        // System.out.println(factory.createMur().getDescription());
        // System.out.println(factory.createPiece().getDescription());
        // System.out.println(factory.createPorte().getDescription());

        ArrayLabyrintheBuilder labyrintheBuilder = new ArrayLabyrintheBuilder();
        labyrintheBuilder.begin(10, 10, factory);

        labyrintheBuilder.addPiece(0, 1);
        labyrintheBuilder.addPiece(0, 2);
        labyrintheBuilder.addPiece(0, 3);
        labyrintheBuilder.addPiece(1, 4);
        labyrintheBuilder.addPiece(1, 5);
        labyrintheBuilder.addPiece(1, 7);
    }

    private static LabyrintheFactory getFactory(String type) {
        LabyrintheFactory factory = null;
        switch (type){
            case "Chateau":
                factory = new ChateauFactory();
                break;
            case "Jardin":
                factory = new JardinFactory();
                break;
        }
        return factory;
    }
}
