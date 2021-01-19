package einkaufsliste;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Recipe {
    //Attributes
    Scanner scanner = new Scanner(System.in);
    private final String spaghettiBolognese = "D:\\Programmieren\\IdeaProjects\\Einkaufsliste\\src\\einkaufsliste\\Rezepte\\GebratenerReis.txt";
    private final String gebratenerReis = "D:\\Programmieren\\IdeaProjects\\Einkaufsliste\\src\\einkaufsliste\\Rezepte\\GebratenerReis.txt";
    private final String quarkbrot = "D:\\Programmieren\\IdeaProjects\\Einkaufsliste\\src\\einkaufsliste\\Rezepte\\Quarkbrot.txt";
    private ArrayList<String> spaghettiBologneseArrayList = new ArrayList<>(Files.readAllLines(Paths.get(spaghettiBolognese)));
    //private final ArrayList<String> gebratenerReisArrayList = new ArrayList<>(Files.readAllLines(Paths.get(gebratenerReis)));
    //private final ArrayList<String> quarkbrotArrayList = new ArrayList<>(Files.readAllLines(Paths.get(quarkbrot)));
    private String[][] recipeArray = new String[spaghettiBologneseArrayList.size()][2];

    //Constructors
    public Recipe() throws IOException {
    }

    //Methods
    //show working time in working days
    public void display() {
        //Display all tasks
        if(this.spaghettiBologneseArrayList.isEmpty()){
            System.out.println("Die Datei enthält keine Daten");
        }
        for (int i = 0; i < spaghettiBologneseArrayList.size(); i++) {
            recipeArray[i][0] = spaghettiBologneseArrayList.get(i).substring(0,1);
            recipeArray[i][1] = spaghettiBologneseArrayList.get(i).substring(2).trim();
        }
        for (int i = 0; i < spaghettiBologneseArrayList.size(); i++) {
            for (int j = 0; j < 2; j++){
                System.out.print(recipeArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    //Add recipe to shoppinglist
    public void addRecipe() {
    }

    //Create new recipe
    public void createRecipe() {
    }


}

/*
Gemüse & Obst   = 1
Nudeln & Co     = 2
Kühltheke       = 3
Fleisch         = 4
Kaffe & Brot    = 5
Getränke        = 6
Konserven       = 7
Tiefkühltheke   = 8
Süßigkeiten     = 9
Hygiene         = 10
Haushalt        = 11
Sonstiges       = 11
 */