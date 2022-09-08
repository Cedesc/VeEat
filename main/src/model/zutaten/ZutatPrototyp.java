package model.zutaten;

import model.Naehrwerte;

import java.util.Date;


/**
 * Ein Prototyp von den Zutaten, einzig dafür da um als Vorlage für die tatsächlichen Zutaten zu dienen.
 */
public class ZutatPrototyp extends AbstrakteZutat {

    /**
     * Konstruktor
     * @param typID Einzigartige ID je Typ der Zutat
     * @param name Name der Zutat
     * @param mindesthaltbarkeitsdatum Mindesthaltbarkeitsdatum der Zutat
     * @param mengeZahl Angabe wie groß die Menge ist, allerdings nur die "Zahl".
     * @param mengeTyp Angabe was es für eine Menge ist, allerdings nur die "Einheit"
     * @param einheitsgroesse Festgelegte Standardgröße der Zutat
     * @param naehrwerteProEinheitsgroesse Nährwerte der Zutat pro Einheitsgröße
     */
    public ZutatPrototyp(int typID, String name, Date mindesthaltbarkeitsdatum, int mengeZahl, String mengeTyp,
                         int einheitsgroesse, Naehrwerte naehrwerteProEinheitsgroesse) {
        this.typID = typID;
        this.name = name;
        this.mindesthaltbarkeitsdatum = mindesthaltbarkeitsdatum;
        this.mengeZahl = mengeZahl;
        this.mengeTyp = mengeTyp;
        this.einheitsgroesse = einheitsgroesse;
        this.naehrwerteProEinheitsgroesse = naehrwerteProEinheitsgroesse;
    }

    /**
     * @param neuerName Neuer Name statt dem Standardnamen
     * @param neueHaltbarkeit Neue Haltbarkeit statt der Standardhaltbarkeit
     * @param neueMengeZahl Neue Menge statt der Standardmenge
     * @return Zutat, die vom Prototyp geklont wird
     */
    @Override
    public Zutat createZutat(String neuerName, Date neueHaltbarkeit, int neueMengeZahl) {
        // TODO: 29.08.2022 Implementierung
        return null;
    }

    // Weitere Signaturen zur Imitation von optionalen Parametern. Geht nur solange jeder Typ der Parameter
    // unterschiedlich ist.
    public Zutat createZutat(String neuerName, Date neueHaltbarkeit) {
        return createZutat(neuerName, neueHaltbarkeit, mengeZahl);
    }
    public Zutat createZutat(String neuerName, int neueMengeZahl) {
        return createZutat(neuerName, mindesthaltbarkeitsdatum, neueMengeZahl);
    }
    public Zutat createZutat(Date neueHaltbarkeit, int neueMengeZahl) {
        return createZutat(name, neueHaltbarkeit, neueMengeZahl);
    }
    public Zutat createZutat(String neuerName) {
        return createZutat(neuerName, mindesthaltbarkeitsdatum, mengeZahl);
    }
    public Zutat createZutat(Date neueHaltbarkeit) {
        return createZutat(name, neueHaltbarkeit, mengeZahl);
    }
    public Zutat createZutat(int neueMengeZahl) {
        return createZutat(name, mindesthaltbarkeitsdatum, neueMengeZahl);
    }
    public Zutat createZutat() {
        return createZutat(name, mindesthaltbarkeitsdatum, mengeZahl);
    }

    @Override
    public String toString() {
        return "Prototyp " + super.toString();
    }
}
