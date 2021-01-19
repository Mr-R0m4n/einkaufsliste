package einkaufsliste;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Recipe {
    //Attributes

    private String recipe;
    private ArrayList<String> recipeArrayList;
    private ArrayList<String> shoppinglist;


    //Constructors

    //Methods
    public void addRecipe() throws IOException {
        Scanner scannerAdd = new Scanner(System.in);
        String[][] recipeArray;
        String fileName = null;
        System.out.println("Welches Rezept möchtest Du deiner Einkaufsliste hinzufügen?");
        System.out.println("Spaghetti Bolognese     1");
        System.out.println("Gebratener Reis         2");
        System.out.println("Quarkbrot               3");
        switch (scannerAdd.nextInt()) {
            case 1 -> {
                fileName = "\\SpaghettiBolognese.txt";
            }
            case 2 -> {
                fileName = "\\GebratenerReis.txt";
            }
            case 3 -> {
                fileName = "\\Quarkbrot.txt";
            }
        }
        this.recipe = "D:\\Programmieren\\IdeaProjects\\Einkaufsliste\\src\\einkaufsliste\\Rezepte" + fileName;
        this.recipeArrayList = new ArrayList<>(Files.readAllLines(Paths.get(recipe)));
        recipeArray = new String[recipeArrayList.size()][2];
        for (int i = 0; i < this.recipeArrayList.size(); i++) {
            recipeArray[i][0] = this.recipeArrayList.get(i).substring(0,2).trim();
            recipeArray[i][1] = this.recipeArrayList.get(i).substring(2).trim();
        }
        for (int i = 0; i < this.recipeArrayList.size(); i++) {
            for (int j = 0; j < 2; j++){
                System.out.print(recipeArray[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(recipeArrayList);
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