package einkaufsliste;

import java.util.Scanner;

public class Rezept {

    private String name;
    private int anzahlZutaten;
    private String[][] einkaufsliste;

    public Rezept(String name, int anzahlZutaten) {
        this.name = name;
        this.anzahlZutaten = anzahlZutaten;
        einkaufsliste = new String[anzahlZutaten][2];
    }

    public void generateList() {
        System.out.println();
        System.out.println("Bitte geben Sie die benötigten Zutaten für die Einkaufsliste ein");
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < this.einkaufsliste.length; i++) {
            System.out.println();
            System.out.println("Bitte geben Sie den Namen der " + (i+1) + ". Zutat ein: ");
            this.einkaufsliste[i][0] = scanner.next();
            System.out.println("Bitte wählen Sie die Kategorie der Zutat");
            switch (scanner.nextInt()){
                case 1 -> {
                    System.out.println();
                    System.out.println("Gemüse & Obst");
                    this.einkaufsliste[i][1] = "Gemüse";
                }
                case 2 -> {
                    System.out.println();
                    System.out.println("Nudeln & Co");
                    this.einkaufsliste[i][1] = "Nudeln und Co";
                }
                case 3 -> {
                    System.out.println();
                    System.out.println("Kühltheke");
                    this.einkaufsliste[i][1] = "Kühltheke";
                }
            }
            this.einkaufsliste[i][1] = scanner.next();
        }
    }

    public void setAnzahlZutaten(int anzahlZutaten) {
        this.anzahlZutaten = anzahlZutaten;
    }
}
