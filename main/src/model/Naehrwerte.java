package model;


/**
 * Gibt die Naehrwerte für Rezepte oder Zutaten an.
 */
public class Naehrwerte {

    public double brennwert;
    public double fett;
    public double kohlenhydrate;
    // Zucker gehört an sich zu Kohlenhydraten
    public double zucker;
    public double ballaststoffe;
    public double eiweiss;
    public double salz;


    @Override
    public String toString() {
        // TODO: 29.08.2022 Implementierung
        return "";
    }

}
