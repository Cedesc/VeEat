package model.zutaten;

import model.Naehrwerte;

import java.util.Date;


/**
 * Konkrete Zutat, die auch im Lager und in Rezepten genutzt wird.
 */
public class Zutat extends AbstrakteZutat {

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
    public Zutat(int typID, String name, Date mindesthaltbarkeitsdatum, int mengeZahl, String mengeTyp,
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
     * @return nichts, es wird immer ein Fehler geworfen
     * @throws NoSuchMethodException wenn die Methode aufgerufen wird, da sie in dieser Klasse nicht aufgerufen
     * werden darf
     */
    @Override
    protected Zutat createZutat(String neuerName, Date neueHaltbarkeit, int neueMengeZahl) throws NoSuchMethodException {
        throw new NoSuchMethodException();
    }

}
