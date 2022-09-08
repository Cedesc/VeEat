package model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LagerTest {

    private final Lager lager = Lager.getInstance();

    @BeforeEach
    void setUp() {
        // TODO: 08.09.2022 füge ein paar Testzutaten hinzu
    }

    @AfterEach
    void tearDown() {
        // TODO: 08.09.2022 lösche alle Zutaten
    }


    @Test
    void getInstance() {
        Lager lagerKopie = Lager.getInstance();
        assertEquals(lager, lagerKopie);
        assertEquals(lager.toString(), lagerKopie.toString());
        // TODO: 08.09.2022 füge Zutat zu lager hinzu, prüfe ob Instanzen immer noch gleich sind,
        //  prüfe ob Strings der beiden gleich sind
    }

    @Test
    void zutatenHinzufuegen() {
    }

    @Test
    void zutatenEntfernen() {
    }

    @Test
    void getLagerbestand() {
    }

    @Test
    void checkHaltbarkeiten() {
    }
}