package domainLogic.zutaten;

import domainLogic.Naehrwerte;

import java.util.Date;


/**
 * Abstrakte Klasse, die als Vererber für die tatsächlichen Zutaten und die Prototypen dient.
 */
public abstract class AbstrakteZutat {

    /**
     * Pro Typ der Zutat einzigartige ID. Mehrere Instanzen von Bananen haben dennoch die gleiche typID. Kann abseits
     * des Namen noch praktisch sein, da man so auch Vollkornnudeln und Weizennudeln einerseits als verschiedene
     * Instanzen, andererseits aber doch als gleich sehen kann. In dem Fall wäre der Typ "Nudeln".
     */
    protected int typID;

    public String name;

    public Date mindesthaltbarkeitsdatum;

    /**
     * Angabe wie groß die Menge ist, aber nur die "Zahl". Heißt bei "150 g" wäre die mengeZahl "150".
     */
    public int mengeZahl;

    /**
     * Angabe was es für eine Menge ist, aber nur die "Einheit". Heißt bei "150 g" wäre der mengeTyp "g".
     */
    protected String mengeTyp;

    /**
     * Eine festgelegte Standardgröße der Zutat. Kann z.B. bei Bananen "1" für eine Banane sein. Wichtig um die
     * Nährwerte zu berechnen.
     */
    protected int einheitsgroesse;

    /**
     * Die Nährwerte der Zutat pro Einheitsgröße, nicht der aktuellen Menge.
     */
    protected Naehrwerte naehrwerteProEinheitsgroesse;


    @Override
    public String toString() {
        // TODO: 29.08.2022 Implementierung
        return "";
    }

    /**
     * String, der die {@link #mengeZahl} und den {@link #mengeTyp} zusammen als Menge ausgibt.
     *
     * <blockquote><pre>
     *     Format: "{@link #mengeZahl} {@link #mengeTyp}"
     *     Beispiele: "500 mg" , "1 Becher", "3 Esslöffel"
     * </pre></blockquote>
     *
     * @return Menge der Zutat
     */
    public String getMenge() {
        // TODO: 29.08.2022 Implementierung
        return "";
    }

    /**
     * @return Nährwerte der Zutat, mit Einbezug der Menge
     */
    public Naehrwerte getNaehrwerte() {
        // TODO: 29.08.2022 Implementierung
        return null;
    }

    protected abstract Zutat createZutat(String neuerName, Date neueHaltbarkeit, int neueMengeZahl)
            throws NoSuchMethodException;

}
