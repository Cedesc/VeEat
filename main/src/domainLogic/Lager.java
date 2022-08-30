package domainLogic;

import domainLogic.zutaten.Zutat;

import java.util.List;


/**
 * Lager ist ein Singleton, da genau eins benötigt wird.
 */
public class Lager {

    /**
     * Eine mutable list der Zutaten im Lager. Mutable daher, da oft Zutaten hinzugefügt oder entfernt werden müssen.
     */
    public List<Zutat> vorhandeneZutaten;


    /**
     * Privater Konstruktor, um Erstellung von neuen Instanzen zu vermeiden.
     */
    private Lager() {}

    /**
     * Singleton Instanz des Lagers
     */
    private static final Lager INSTANZ = new Lager();

    /**
     * @return Singleton Instanz
     */
    public static Lager getLager() {
        return INSTANZ;
    }


    /**
     * Fügt neue Zutaten ans Ende der Liste vorhandeneZutaten an.
     * @param zutaten Zutaten, die hinzugefügt werden sollen
     */
    public void zutatenHinzufuegen(Zutat[] zutaten) {
        // TODO: 29.08.2022 Implementierung
    }

    /**
     * Geht von Anfang bis Ende durch die Liste an Zutaten im Lager durch und entfernt so die übergebenen Zutaten.
     * @param zutaten Zutaten, die entfernt werden sollen
     */
    public void zutatenEntfernen(Zutat[] zutaten) {
        // TODO: 29.08.2022 Implementierung
    }

    /**
     * @return Gibt alle einzigartigen Zutaten (ohne Duplikate) im Lager zurück. Die Mengen gleicher Zutaten werden
     * dabei summiert.
     */
    public Zutat[] getLagerbestand() {
        // TODO: 29.08.2022 Implementierung
        return null;
    }

    /**
     * @param tage Anzahl an Tagen, in denen die gesuchten Zutaten ihr Mindesthaltbarkeitsdatum überschreiten.
     * @return Gibt alle Zutaten aus dem Lager zurück (mit Duplikaten!), die innerhalb von {tage} Tagen ihr
     * Mindesthaltbarkeitsdatum erreichen.
     */
    public Zutat[] checkHaltbarkeiten(int tage) {
        // TODO: 29.08.2022 Implementierung
        return null;
    }

}
