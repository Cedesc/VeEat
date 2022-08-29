package domainLogic.zutaten;

import domainLogic.Naerhwerte;

// TODO: 29.08.2022 Klasse kommentieren
// TODO: 29.08.2022 Attribute kommentieren
// TODO: 29.08.2022 Methoden kommentieren
public abstract class AbstrakteZutat {

    protected int typID;
    public String name;
    public int haltbarkeit;
    public int mengeZahl;
    protected String mengeTyp;
    protected int einheitsgroesse;
    protected Naerhwerte naerhwerte;

    @Override
    public String toString() {
        // TODO: 29.08.2022 Implementierung
        return "";
    }

    public String getMenge() {
        // TODO: 29.08.2022 Implementierung
        return "";
    }

    public Naerhwerte getNaehrwerte() {
        // TODO: 29.08.2022 Implementierung
        return null;
    }

    public abstract Zutat createZutat();

}
