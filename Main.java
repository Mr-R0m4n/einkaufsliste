package einkaufsliste;

public class Main {

    public static void main(String[] args) {
        Rezept rezept = new Rezept("Spagetti", 4);
        rezept.setAnzahlZutaten(4);
        rezept.generateList();
    }
}
