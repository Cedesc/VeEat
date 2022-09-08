package model.zutaten;

import model.Naehrwerte;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ZutatTest {

    private Zutat zutat1;
    private Zutat zutat2;
    private Zutat zutat3;

    @BeforeEach
    void setUp() {

        Naehrwerte naehrwerte1 = new Naehrwerte(10, 9, 8, -1, 6, 5, 4);
        Naehrwerte naehrwerte2 = new Naehrwerte(3, -1, 9, 12, -1, 5, -1);
        Naehrwerte naehrwerte3 = new Naehrwerte();

        zutat1 = new Zutat(27, "Bananen", LocalDate.of(2023, 10, 13),
                5, "Stück", 1, naehrwerte1);
        zutat2 = new Zutat(1337, "Mehl", LocalDate.of(2022, 9, 15),
                700, "g", 1000, naehrwerte2);
        zutat3 = new Zutat(11, "Knoblauch", LocalDate.of(2045, 3, 30),
                7, "Zehen", 1, naehrwerte3);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testToString() {
        assertEquals("KonkreteZutat\n" +
                             "    TypID = 27\n" +
                             "    Name = Bananen\n" +
                             "    Mindesthaltbarkeitsdatum = 13.10.23\n" +
                             "    Menge = 5 Stück\n" +
                             "    Einheitsgroesse = 1\n" +
                             "    Naehrwerte pro Einheitsgroesse = { 10.0 , 9.0 , 8.0 , Keine Angabe , 6.0 , 5.0 , 4.0 }\n" +
                             "    Naehrwerte auf Menge gerechnet = { 50.0 , 45.0 , 40.0 , Keine Angabe , 30.0 , 25.0 , 20.0 }\n",
                zutat1.toString());
        assertEquals("KonkreteZutat\n" +
                             "    TypID = 1337\n" +
                             "    Name = Mehl\n" +
                             "    Mindesthaltbarkeitsdatum = 15.09.22\n" +
                             "    Menge = 700 g\n" +
                             "    Einheitsgroesse = 1000\n" +
                             "    Naehrwerte pro Einheitsgroesse = { 3.0 , Keine Angabe , 9.0 , 12.0 , Keine Angabe , 5.0 , Keine Angabe }\n" +
                             "    Naehrwerte auf Menge gerechnet = { 2.0999999999999996 , Keine Angabe , 6.3 , 8.399999999999999 , Keine Angabe , 3.5 , Keine Angabe }\n",
                zutat2.toString());
        assertEquals("KonkreteZutat\n" +
                             "    TypID = 11\n" +
                             "    Name = Knoblauch\n" +
                             "    Mindesthaltbarkeitsdatum = 30.03.45\n" +
                             "    Menge = 7 Zehen\n" +
                             "    Einheitsgroesse = 1\n" +
                             "    Naehrwerte pro Einheitsgroesse = { Keine Angabe , Keine Angabe , Keine Angabe , Keine Angabe , Keine Angabe , Keine Angabe , Keine Angabe }\n" +
                             "    Naehrwerte auf Menge gerechnet = { Keine Angabe , Keine Angabe , Keine Angabe , Keine Angabe , Keine Angabe , Keine Angabe , Keine Angabe }\n",
                zutat3.toString());
    }

    @Test
    void getMenge() {
    }

    @Test
    void getNaehrwerte() {
    }

    @Test
    void createZutat() {
    }
}