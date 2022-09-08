package model;


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
        this.brennwert = brennwert;
        this.fett = fett;
        this.kohlenhydrate = kohlenhydrate;
        this.zucker = zucker;
        this.ballaststoffe = ballaststoffe;
        this.eiweiss = eiweiss;
        this.salz = salz;
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
        this.brennwert = brennwert;
    }

    public void setFett(double fett) {
        this.fett = fett;
    }

    public void setKohlenhydrate(double kohlenhydrate) {
        this.kohlenhydrate = kohlenhydrate;
    }

    public void setZucker(double zucker) {
        this.zucker = zucker;
    }

    public void setBallaststoffe(double ballaststoffe) {
        this.ballaststoffe = ballaststoffe;
    }

    public void setEiweiss(double eiweiss) {
        this.eiweiss = eiweiss;
    }

    public void setSalz(double salz) {
        this.salz = salz;
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

}
