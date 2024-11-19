package es.santander.ascender.proyecto06;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.junit.jupiter.api.Test;

public class PerroTest {
    @Test
    void testComer() {
        Perro perro = new Perro(1, 45.5);

        perro.comer(34.2);

        assertEquals(79.7, perro.getPeso(), 0.000001);
    }

    @Test
    void testComparar() {
        int a = 3, b = 3;

        assertTrue(a == b);

        assertEquals("hola", "hola");

        Perro caniche = new Perro(1, 0.5);
        Perro doberman = new Perro(1, 14);

        // Pasa, pero con objetos lo tratamo de evitar
        assertFalse(caniche == doberman);
        assertTrue(caniche.equals(doberman));
        assertTrue(Objects.equals(caniche, doberman));

    }    

    @Test
    void testCompararColeccionesVerdad() {



    }

    @Test 
    void testCompararColeccionesFalse() {

    }

    public boolean comparar(List<Perro> lista1, List<Perro> lista2) {
        if (lista1 == null && lista2 == null) {
            return true;
        } 
        if (lista1 == null || lista2 == null) {
            return false;
        } 
        if (lista1.size() != lista2.size()) {
            return false;
        } 
        for (int i = 0; i < lista1.size(); i++) {
            if (! Objects.equals(lista1.get(i), lista2.get(i))) {
                return false;
            }
        }
        return true;
    }
}
