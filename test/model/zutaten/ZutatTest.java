package model.zutaten;

import model.Naehrwerte;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import static org.junit.jupiter.api.Assertions.*;

class ZutatTest {

    private Zutat zutat1;
    private Zutat zutat2;

    @BeforeEach
    void setUp() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        zutat1 = new Zutat(27, "Bananen", sdf.parse("13-10-2023"),
                5, "Stück", 1, new Naehrwerte());
        zutat2 = new Zutat(1337, "Mehl", sdf.parse("15-09-2022"),
                700, "g", 500, new Naehrwerte());
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testToString() {
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