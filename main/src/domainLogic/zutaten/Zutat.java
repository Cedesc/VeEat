package domainLogic.zutaten;

import java.util.Date;

/**
 * Konkrete Zutat, die auch im Lager und in Rezepten genutzt wird.
 */
public class Zutat extends AbstrakteZutat {

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
