package domainLogic;

import domainLogic.enums.Gegenstand;
import domainLogic.enums.Tag;
import domainLogic.zutaten.Zutat;

import java.util.Date;


public class Rezept {

    /**
     * Einzigartige ID je Rezept
     */
    public int id;

    public String name;

    /**
     * Datum, an dem das Rezept in die Datenbank aufgenommen wurde.
     */
    public Date hinzugefuegtDatum;

    /**
     * Zubereitungszeit in Minuten
     */
    public int zubereitungszeitGesamt;

    /**
     * Zubereitungszeit in Minuten ohne z.B. im "Ofen backen lassen".
     */
    public int zubereitungszeitArbeit;


    /**
     * Benötigte Zutaten
     */
    public Zutat[] zutaten;

    /**
     * Weitere empfohlene Zutaten
     */
    public Zutat[] optionaleZutaten;

    /**
     * Naehrwerte des Gerichts, im Zweifel die Naehrwerte der Zutaten summiert
     */
    public Naehrwerte naehrwerte;

    public Anleitung anleitung;

    /**
     * Benötigte Utensilien wie z.B. Ofen oder Stabmixer
     */
    public Gegenstand[] noetigeUtensilien;

    public Tag[] tags;


    @Override
    public String toString() {
        // TODO: 30.08.2022 Implementierung
        return "";
    }
}
