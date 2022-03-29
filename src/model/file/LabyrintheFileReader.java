package model.file;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import factory.LabyrintheFactory;
import model.builder.LabyrintheBuilder;

public class LabyrintheFileReader {
    public static void read(File file, LabyrintheBuilder builder, LabyrintheFactory factory){
        int lig = 0;
        int maxline = 0;
        int maxColumn = 0;
        try {
            List<String> list = new ArrayList<>();
            //Files.lines(file.toPath()).peek(list::add).findAny().orElse("S");
            list = Files.lines(file.toPath()).toList();
            //System.out.println(list);
            maxline = list.size();
            for (String line : list) {
                //System.out.println(line);
                String[] splitLineFile = line.split("\\t");
                if(maxColumn == 0){
                    maxColumn = splitLineFile.length;
                    builder.begin(maxline, maxColumn, factory);
                }
                for (int col = 0; col < splitLineFile.length; col++) {
                    //System.out.println(splitLineFile[col].trim());
                    switch (splitLineFile[col].trim()) {
                        case "M":
                            //System.out.println("Mur");
                            builder.addMur(lig, col);
                            break;
                        case "P":
                            //System.out.println("Pièce");
                            builder.addPiece(lig, col);
                            break;
                        case "E":
                            //System.out.println("Entrée");
                            builder.addPiece(lig, col);
                            builder.setEntry(lig, col);
                            break;
                        case "PO":
                            //System.out.println("Porte");
                            builder.addPorte(lig, col);
                            break;
                        case "S":
                            builder.addPiece(lig, col);
                            break;
                    
                        default:
                            break;
                    }
                }
                lig++;
            }
            builder.end();
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        
        // try (Scanner input = new Scanner(file);) {
        //     while (input.hasNextLine()) {
        //         String line = input.nextLine();
        //         //System.out.println(line);
        //         String[] splitLineFile = line.split("\\t");
        //         //System.out.println(Arrays.asList(splitLineFile));
        //         for (int col = 0; col < splitLineFile.length; col++) {
        //             switch (splitLineFile[col].trim()) {
        //                 case "M":
        //                     builder.addMur(lig, col);
        //                     break;
        //                 case "P":
        //                     builder.addPiece(lig, col);
        //                     break;
        //                 case "E":
        //                     builder.addPiece(lig, col);
        //                     builder.setEntry(lig, col);
        //                     break;
        //                 case "PO":
        //                     builder.addPorte(lig, col);
        //                     break;
        //                 case "S":
        //                     builder.end();
        //                     break;
                    
        //                 default:
        //                     break;
        //             }
        //         }
        //         lig++;
                
        //     }
        // } catch (Exception e) {
        //     e.printStackTrace();
        // }
    }
}
