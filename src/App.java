import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

import factory.LabyrintheFactory;
import model.Joueur;
import model.builder.ArrayLabyrintheBuilder;
import model.builder.LabyrintheBuilder;
import model.chateau.ChateauFactory;
import model.file.LabyrintheFileReader;
import model.jardin.JardinFactory;
import model.labyrinthe.Direction;
import model.labyrinthe.Labyrinthe;
import model.labyrinthe.LabyrintheElement;

public class App {
    public static void main(String[] args) throws Exception {
        LabyrintheFactory factory = getFactory("Chateau");

        //System.out.println(factory.createMur().getDescription());
        // System.out.println(factory.createPiece().getDescription());
        // System.out.println(factory.createPorte().getDescription());

        // String[] test = {"test","lol"};

        // String[] test2 = test.clone();
        // test2[0] = "lol2";

        // System.out.println(Arrays.asList(test));
        // System.out.println(Arrays.asList(test2));

        LabyrintheBuilder labyrintheBuilder = new ArrayLabyrintheBuilder();
        

        LabyrintheFileReader.read(new File("./src/ressources/labyrinthe.txt"), labyrintheBuilder, factory);

        //System.out.println(Arrays.asList(labyrintheBuilder.getLabyrinthe().getGrille()));
        for (int i = 0; i < labyrintheBuilder.getLabyrinthe().getGrille().length; i++) {
            //System.out.println(labyrintheBuilder.getLabyrinthe().getGrille()[i]);
            for (int j = 0; j < labyrintheBuilder.getLabyrinthe().getGrille()[i].length; j++) {
                System.out.print(labyrintheBuilder.getLabyrinthe().getGrille()[i][j] + "\t");
            }
            System.out.println();
        }

        Labyrinthe laby = labyrintheBuilder.getLabyrinthe();


        Scanner scanner = new Scanner(System.in);
        Joueur joueur = new Joueur(laby);
        Direction playerDirection;
        do{
            System.out.println("Direction (n,e,s,o) : ");
            playerDirection = switch(scanner.next().toLowerCase()) {
                case "n" -> Direction.NORD;
                case "e" -> Direction.EST;
                case "s" -> Direction.SUD;
                case "o" -> Direction.OUEST;
                default -> null;
            };
            joueur.move(playerDirection);

        }while(!joueur.isFinish());

        //System.out.println(labyrintheBuilder.getLabyrinthe().getGrille()[1][1]);

        // labyrintheBuilder.addPiece(0, 1);
        // labyrintheBuilder.addPiece(0, 2);
        // labyrintheBuilder.addPiece(0, 3);
        // labyrintheBuilder.addPiece(1, 4);
        // labyrintheBuilder.addPiece(1, 5);
        // labyrintheBuilder.addPiece(1, 7);
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
