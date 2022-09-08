package model;


/**
 * Statt einfachem String für die Anleitung, mit dieser abgekapselten Klasse Möglichkeit offen halten z.B.
 * Schritt-für-Schritt Anleitungen zu nutzen.
 */
public class Anleitung {

    /**
     * Kompletter Text der Anleitung.
     */
    public String text;

    /**
     * Konstruktor
     * @param text Kompletter Text der Anleitung
     */
    public Anleitung(String text) {
        this.text = text;
    }

    /**
     * @return Gesamter {@link #text}
     */
    @Override
    public String toString() {
        return "Anleitung\n" + this.text;
    }
}
