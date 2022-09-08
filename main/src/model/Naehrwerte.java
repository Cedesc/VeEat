package model;


import java.util.Objects;

/**
 * Gibt die Naehrwerte für Rezepte oder Zutaten an.
 */
public class Naehrwerte {

    private double brennwert;
    private double fett;
    private double kohlenhydrate;
    // Zucker gehört an sich zu Kohlenhydraten
    private double zucker;
    private double ballaststoffe;
    private double eiweiss;
    private double salz;

    public Naehrwerte() {
        this.brennwert = -1;
        this.fett = -1;
        this.kohlenhydrate = -1;
        this.zucker = -1;
        this.ballaststoffe = -1;
        this.eiweiss = -1;
        this.salz = -1;
    }

    public Naehrwerte(double brennwert, double fett, double kohlenhydrate, double zucker,
                      double ballaststoffe, double eiweiss, double salz) {
        setBrennwert(brennwert);
        setFett(fett);
        setKohlenhydrate(kohlenhydrate);
        setZucker(zucker);
        setBallaststoffe(ballaststoffe);
        setEiweiss(eiweiss);
        setSalz(salz);
    }


    /**
     * Jeder Wert wird multipliziert mit dem Faktor:
     *
     * <blockquote><pre>
     *     tatsächlicheMenge / einheitsgroesse
     * </pre></blockquote>
     *
     * @param einheitsgroesse Die Menge, für die die Naehrwerte korrekt sind
     * @param tatsaechlicheMenge Die Menge, für die die Naehrwerte berechnet werden sollen
     * @return Multiplizierte Naehrwerte für eine bestimmte Menge
     */
    public Naehrwerte aufMengeBerechnen(int tatsaechlicheMenge, int einheitsgroesse) {
        // Berechne den zu multiplizierenden Faktor
        double faktor = ((double) tatsaechlicheMenge) / ((double) einheitsgroesse);

        // Multipliziere jeden Wert mit dem Faktor
        return new Naehrwerte(brennwert * faktor, fett * faktor, kohlenhydrate * faktor,
                zucker * faktor, ballaststoffe * faktor, eiweiss * faktor,
                salz * faktor);
    }

    public String getBrennwert() {
        if (brennwert < 0) {
            return "Keine Angabe";
        }
        else return String.valueOf(brennwert);
    }

    public String getFett() {
        if (fett < 0) {
            return "Keine Angabe";
        }
        else return String.valueOf(fett);
    }

    public String getKohlenhydrate() {
        if (kohlenhydrate < 0) {
            return "Keine Angabe";
        }
        else return String.valueOf(kohlenhydrate);
    }

    public String getZucker() {
        if (zucker < 0) {
            return "Keine Angabe";
        }
        else return String.valueOf(zucker);
    }

    public String getBallaststoffe() {
        if (ballaststoffe < 0) {
            return "Keine Angabe";
        }
        else return String.valueOf(ballaststoffe);
    }

    public String getEiweiss() {
        if (eiweiss < 0) {
            return "Keine Angabe";
        }
        else return String.valueOf(eiweiss);
    }

    public String getSalz() {
        if (salz < 0) {
            return "Keine Angabe";
        }
        else return String.valueOf(salz);
    }

    public void setBrennwert(double brennwert) {
        // TODO: 08.09.2022 Bei ALLEN sets auf zwei Nachkommastellen begrenzen
        if (brennwert < 0) this.brennwert = -1.0;
        else this.brennwert = brennwert;
    }

    public void setFett(double fett) {
        if (fett < 0) this.fett = -1.0;
        else this.fett = fett;
    }

    public void setKohlenhydrate(double kohlenhydrate) {
        if (kohlenhydrate < 0) this.kohlenhydrate = -1.0;
        else this.kohlenhydrate = kohlenhydrate;
    }

    public void setZucker(double zucker) {
        if (zucker < 0) this.zucker = -1.0;
        else this.zucker = zucker;
    }

    public void setBallaststoffe(double ballaststoffe) {
        if (ballaststoffe < 0) this.ballaststoffe = -1.0;
        else this.ballaststoffe = ballaststoffe;
    }

    public void setEiweiss(double eiweiss) {
        if (eiweiss < 0) this.eiweiss = -1.0;
        else this.eiweiss = eiweiss;
    }

    public void setSalz(double salz) {
        if (salz < 0) this.salz = -1.0;
        else this.salz = salz;
    }

    @Override
    public String toString() {
        return "Naehrwerte" +
                "\n   Brennwert = " + getBrennwert() +
                "\n   Fett = " + getFett() +
                "\n   Kohlenhydrate = " + getKohlenhydrate() +
                "\n   Zucker = " + getZucker() +
                "\n   Ballaststoffe = " + getBallaststoffe() +
                "\n   Eiweiss = " + getEiweiss() +
                "\n   Salz = " + getSalz() + "\n";
    }

    /**
     * Kürzere Ausgabe der Naehrwerte zum besseren Nutzen in der Ausgabe einer Zutat.
     */
    public String toString_short() {
        return "{ " + getBrennwert() + " , " + getFett() + " , " +
                getKohlenhydrate() + " , " + getZucker() + " , " +
                getBallaststoffe() + " , " + getEiweiss() + " , " +
                getSalz() + " }";
    }

    @Override
    public boolean equals(Object o) {
        // Objektreferenzen identisch?
        if (this == o) return true;
        // Ist Objekt null? Oder ist die Klasse des Objekts eine andere?
        if (o == null || getClass() != o.getClass()) return false;
        // Typkonvertierung von Objekt zu Naehrwerte
        Naehrwerte that = (Naehrwerte) o;
        return Double.compare(that.brennwert, brennwert) == 0 && Double.compare(that.fett, fett) == 0 &&
                Double.compare(that.kohlenhydrate, kohlenhydrate) == 0 && Double.compare(that.zucker, zucker) == 0 &&
                Double.compare(that.ballaststoffe, ballaststoffe) == 0 && Double.compare(that.eiweiss, eiweiss) == 0 &&
                Double.compare(that.salz, salz) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(brennwert, fett, kohlenhydrate, zucker, ballaststoffe, eiweiss, salz);
    }
}
