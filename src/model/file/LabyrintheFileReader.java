package model.file;

import java.io.File;
import java.util.Scanner;

import factory.LabyrintheFactory;
import model.builder.LabyrintheBuilder;

public class LabyrintheFileReader {
    public void read(File file, LabyrintheBuilder builder, LabyrintheFactory factory){
        try (Scanner input = new Scanner(file);) {
            while (input.hasNextLine()) {
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
