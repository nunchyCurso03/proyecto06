package es.santander.ascender.proyecto06;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PerroTest {
    @Test
    void testComer() {
        Perro perro = new Perro(45.5);

        perro.comer(34.2);

        assertEquals(79.7, perro.getPeso(), 0.000001);
    }
}
