package model.zutaten;

import java.util.Date;

/**
 * Ein Prototyp von den Zutaten, einzig dafür da um als Vorlage für die tatsächlichen Zutaten zu dienen.
 */
public class ZutatPrototyp extends AbstrakteZutat {

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

}
