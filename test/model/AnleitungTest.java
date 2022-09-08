package model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnleitungTest {

    private final String beispielText = "Schritt 1: Zutaten raussuchen\n" +
                                        "Schritt 2: kochen\n" +
                                        "Schritt 3: ...\n" +
                                        "Schritt 4: Profit\n";
    private final Anleitung anleitung1 = new Anleitung(beispielText);

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }


    @Test
    void testToString() {
        assertEquals("Anleitung\n" + beispielText, anleitung1.toString());
    }
}