package model;

import model.enums.Gegenstand;
import model.enums.Tag;
import model.zutaten.Zutat;

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


    public Rezept(int id, String name, Date hinzugefuegtDatum, int zubereitungszeitGesamt,
                  int zubereitungszeitArbeit, Zutat[] zutaten, Zutat[] optionaleZutaten,
                  Naehrwerte naehrwerte, Anleitung anleitung, Gegenstand[] noetigeUtensilien,
                  Tag[] tags) {
        this.id = id;
        this.name = name;
        this.hinzugefuegtDatum = hinzugefuegtDatum;
        this.zubereitungszeitGesamt = zubereitungszeitGesamt;
        this.zubereitungszeitArbeit = zubereitungszeitArbeit;
        this.zutaten = zutaten;
        this.optionaleZutaten = optionaleZutaten;
        this.naehrwerte = naehrwerte;
        this.anleitung = anleitung;
        this.noetigeUtensilien = noetigeUtensilien;
        this.tags = tags;
    }


    @Override
    public String toString() {
        // TODO: 30.08.2022 Implementierung
        return "";
    }
}
