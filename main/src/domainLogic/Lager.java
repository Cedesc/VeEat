package domainLogic;

import domainLogic.zutaten.Zutat;

import java.util.List;

// Lager ist ein Singleton, da genau eins benötigt wird.
public class Lager {

    // Eine mutable list der Zutaten im Lager. Mutable daher, da oft Zutaten hinzugefügt oder entfernt werden müssen.
    public List<Zutat> vorhandeneZutaten;


    // Singleton: privater Konstruktor
    private Lager() {}

    // Singleton: Instanz initialisieren
    private static final Lager INSTANZ = new Lager();

    // Singleton: Zugriff auf Instanz ermöglichen
    public static Lager getLager() {
        return INSTANZ;
    }


    // Fügt neue Zutaten ans Ende der Liste vorhandeneZutaten an.
    public void zutatenHinzufuegen(Zutat[] zutaten) {
        // TODO: 29.08.2022 Implementierung
    }

    // Geht von Anfang bis Ende durch die Liste an Zutaten im Lager durch und entfernt so die übergebenen Zutaten.
    public void zutatenEntfernen(Zutat[] zutaten) {
        // TODO: 29.08.2022 Implementierung
    }

    // Gibt keine Duplikate an Zutaten zurück, sondern rechnet die Mengen gleicher Zutaten zusammen.
    public Zutat[] getLagerbestand() {
        // TODO: 29.08.2022 Implementierung
        return null;
    }

    // Gibt alle Zutaten aus dem Lager zurück (mit Duplikaten!), die innerhalb von {tage} Tagen ihr
    // Mindesthaltbarkeitsdatum erreichen.
    public Zutat[] checkHaltbarkeiten(int tage) {
        // TODO: 29.08.2022 Implementierung
        return null;
    }

}
