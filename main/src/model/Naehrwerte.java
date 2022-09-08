package model;


/**
 * Gibt die Naehrwerte für Rezepte oder Zutaten an.
 */
public class Naehrwerte {

    public double brennwert;
    public double fett;
    public double kohlenhydrate;
    // Zucker gehört an sich zu Kohlenhydraten
    public double zucker;
    public double ballaststoffe;
    public double eiweiss;
    public double salz;

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
        if (brennwert == -1) {
            return "Keine Angabe";
        }
        else return String.valueOf(brennwert);
    }

    public String getFett() {
        if (fett == -1) {
            return "Keine Angabe";
        }
        else return String.valueOf(fett);
    }

    public String getKohlenhydrate() {
        if (kohlenhydrate == -1) {
            return "Keine Angabe";
        }
        else return String.valueOf(kohlenhydrate);
    }

    public String getZucker() {
        if (zucker == -1) {
            return "Keine Angabe";
        }
        else return String.valueOf(zucker);
    }

    public String getBallaststoffe() {
        if (ballaststoffe == -1) {
            return "Keine Angabe";
        }
        else return String.valueOf(ballaststoffe);
    }

    public String getEiweiss() {
        if (eiweiss == -1) {
            return "Keine Angabe";
        }
        else return String.valueOf(eiweiss);
    }

    public String getSalz() {
        if (salz == -1) {
            return "Keine Angabe";
        }
        else return String.valueOf(salz);
    }

    @Override
    public String toString() {
        // TODO: 29.08.2022 Implementierung
        return "";
    }

}
