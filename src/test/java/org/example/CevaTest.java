package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CevaTest {

    Ceva c = new Ceva();

    @BeforeEach
    void setUp() {
        c = new Ceva();
    }

    @Test
    void egalCuDoi() {
        assertEquals(c.egalCuDoi(), 2);
    }
    @Test
    void egalCuTrei() {
        assertEquals(c.egalCuDoi(), 3);
    }
}