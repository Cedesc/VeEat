package model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NaehrwerteTest {
    private Naehrwerte naehrwerte1;

    private Naehrwerte naehrwerte2;
    private Naehrwerte naehrwerte3;

    @BeforeEach
    void setUp() {
        naehrwerte1 = new Naehrwerte();
        naehrwerte2 = new Naehrwerte(0, 1, 2, 4, 8, 16, 32);
        naehrwerte3 = new Naehrwerte(24, -1, -1, 42, -1, 1337, -1);
    }

    @AfterEach
    void tearDown() {
    }


    @Test
    void testAufMengeBerechnen() {
        Naehrwerte neueNaehrwerte1 = new Naehrwerte();
        assertEquals(neueNaehrwerte1, naehrwerte1.aufMengeBerechnen(2, 1));
        assertEquals(neueNaehrwerte1, naehrwerte1.aufMengeBerechnen(5, 24));

        Naehrwerte neueNaehrwerte2 = new Naehrwerte(0, 5, 10, 20, 40, 80, 160);
        assertEquals(neueNaehrwerte2, naehrwerte2.aufMengeBerechnen(15, 3));
        assertEquals(neueNaehrwerte2, naehrwerte2.aufMengeBerechnen(50, 10));

        Naehrwerte neueNaehrwerte3 = new Naehrwerte(12, -1, -1, 21, -1, 668.5, -1);
        assertEquals(neueNaehrwerte3, naehrwerte3.aufMengeBerechnen(3, 6));

        assertEquals(naehrwerte2, naehrwerte2.aufMengeBerechnen(1, 1));
        assertEquals(new Naehrwerte(-0.0, -0.0, -0.0, -0.0, -0.0, -0.0, -0.0),
                naehrwerte1.aufMengeBerechnen(0, 1));
        assertEquals(new Naehrwerte(0, 0, 0, 0, 0, 0, 0),
                naehrwerte2.aufMengeBerechnen(0, 1));
    }

    @Test
    void getBrennwert() {
        String expected;

        for (double i = -25.0 ; i < 50.0 ; i++) {

            naehrwerte1.setBrennwert(i);

            if (i < 0) {
                expected = "Keine Angabe";
            }
            else expected = String.valueOf(i);

            assertEquals(expected, naehrwerte1.getBrennwert());
        }
    }

    @Test
    void getFett() {
        String expected;

        for (double i = -25.0 ; i < 50.0 ; i++) {

            naehrwerte1.setFett(i);

            if (i < 0) {
                expected = "Keine Angabe";
            }
            else expected = String.valueOf(i);

            assertEquals(expected, naehrwerte1.getFett());
        }
    }

    @Test
    void getKohlenhydrate() {
        String expected;

        for (double i = -25.0 ; i < 50.0 ; i++) {

            naehrwerte1.setKohlenhydrate(i);

            if (i < 0) {
                expected = "Keine Angabe";
            }
            else expected = String.valueOf(i);

            assertEquals(expected, naehrwerte1.getKohlenhydrate());
        }
    }

    @Test
    void getZucker() {
        String expected;

        for (double i = -25.0 ; i < 50.0 ; i++) {

            naehrwerte1.setZucker(i);

            if (i < 0) {
                expected = "Keine Angabe";
            }
            else expected = String.valueOf(i);

            assertEquals(expected, naehrwerte1.getZucker());
        }
    }

    @Test
    void getBallaststoffe() {
        String expected;

        for (double i = -25.0 ; i < 50.0 ; i++) {

            naehrwerte1.setBallaststoffe(i);

            if (i < 0) {
                expected = "Keine Angabe";
            }
            else expected = String.valueOf(i);

            assertEquals(expected, naehrwerte1.getBallaststoffe());
        }
    }

    @Test
    void getEiweiss() {
        String expected;

        for (double i = -25.0 ; i < 50.0 ; i++) {

            naehrwerte1.setEiweiss(i);

            if (i < 0) {
                expected = "Keine Angabe";
            }
            else expected = String.valueOf(i);

            assertEquals(expected, naehrwerte1.getEiweiss());
        }
    }

    @Test
    void getSalz() {
        String expected;

        for (double i = -25.0 ; i < 50.0 ; i++) {

            naehrwerte1.setSalz(i);

            if (i < 0) {
                expected = "Keine Angabe";
            }
            else expected = String.valueOf(i);

            assertEquals(expected, naehrwerte1.getSalz());
        }
    }

    @Test
    void testToString() {
        assertEquals("Naehrwerte\n" +
                        "   Brennwert = Keine Angabe\n" +
                        "   Fett = Keine Angabe\n" +
                        "   Kohlenhydrate = Keine Angabe\n" +
                        "   Zucker = Keine Angabe\n" +
                        "   Ballaststoffe = Keine Angabe\n" +
                        "   Eiweiss = Keine Angabe\n" +
                        "   Salz = Keine Angabe\n",
                naehrwerte1.toString());
        assertEquals("Naehrwerte\n" +
                        "   Brennwert = 0.0\n" +
                        "   Fett = 1.0\n" +
                        "   Kohlenhydrate = 2.0\n" +
                        "   Zucker = 4.0\n" +
                        "   Ballaststoffe = 8.0\n" +
                        "   Eiweiss = 16.0\n" +
                        "   Salz = 32.0\n",
                naehrwerte2.toString());
        assertEquals("Naehrwerte\n" +
                        "   Brennwert = 24.0\n" +
                        "   Fett = Keine Angabe\n" +
                        "   Kohlenhydrate = Keine Angabe\n" +
                        "   Zucker = 42.0\n" +
                        "   Ballaststoffe = Keine Angabe\n" +
                        "   Eiweiss = 1337.0\n" +
                        "   Salz = Keine Angabe\n",
                naehrwerte3.toString());
    }

}