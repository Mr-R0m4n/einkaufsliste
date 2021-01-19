package einkaufsliste;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Recipe {
    //Attributes

    private String recipe;
    private ArrayList<String> recipeArrayList;
    private ArrayList<String> shoppinglist = new ArrayList<>();
    private ArrayList<String> printlist = new ArrayList<>();
    private final String shopinglistPath = "D:\\Programmieren\\IdeaProjects\\Einkaufsliste\\src\\einkaufsliste\\Einkaufsliste.txt";


    //Constructors

    //Methods
    public void addRecipe() throws IOException {
        boolean loop = true;
        while (loop) {
            Scanner scannerAdd = new Scanner(System.in);
            String fileName = null;
            System.out.println("Welches Rezept möchtest Du deiner Einkaufsliste hinzufügen?");
            System.out.println("Spaghetti Bolognese     1");
            System.out.println("Gebratener Reis         2");
            System.out.println("Quarkbrot               3");
            switch (scannerAdd.nextInt()) {
                case 1 -> fileName = "\\SpaghettiBolognese.txt";
                case 2 -> fileName = "\\GebratenerReis.txt";
                case 3 -> fileName = "\\Quarkbrot.txt";
                default -> System.out.println("Deine Eingabe ist ungültig");
            }
            this.recipe = "D:\\Programmieren\\IdeaProjects\\Einkaufsliste\\src\\einkaufsliste\\Rezepte" + fileName;
            this.recipeArrayList = new ArrayList<>(Files.readAllLines(Paths.get(recipe)));
            this.shoppinglist.addAll(recipeArrayList);
            Collections.sort(this.shoppinglist);
            System.out.println();
            System.out.println("Möchtest du ein weiteres Rezept hinzufügen?");
            System.out.println("1 = Ja");
            System.out.println("2 = Nein");
            System.out.println();
            //Exit loop
            if (scannerAdd.nextInt() != 1) {
                loop = false;
            }
            System.out.println();
        }
        for (int i = 0; i < this.shoppinglist.size(); i++) {
            this.printlist.add(i, this.shoppinglist.get(i).substring(2).trim());
        }
        Files.write(Paths.get(this.shopinglistPath),this.printlist);
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