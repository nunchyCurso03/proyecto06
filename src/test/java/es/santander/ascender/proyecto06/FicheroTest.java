package es.santander.ascender.proyecto06;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;
import java.io.IOException;
import java.util.Objects;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FicheroTest {
    private Fichero cut;

    @BeforeAll
    public static void setUpAll() {
        System.out.println("Paso por el Before All");
    }

    @BeforeEach
    public  void setUp() {
        System.out.println("Paso por el Before Each");
        cut = new FicheroParaTesting();
        Fichero noHagoNadaConEsteEsInterna = new FicheroParaTesting2();

        Fichero noHagoNadaConEstaTampoYNoTieneNiNombre = new Fichero() {

            @Override
            public void hacerElLunes() {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'hacerElLunes'");
            }
            
        };
    }


    @Test
    void testEscribir() throws IOException {
        // Preparaba

        System.out.println("Test1");
        File ficheroTemporalACrear =  File.createTempFile("hola", ".juan");
        String ruta = ficheroTemporalACrear.getAbsolutePath();
        ficheroTemporalACrear.delete();


        byte[] datosAEscribir = new byte[5478];

        // Ejecutaba

        assertFalse(ficheroTemporalACrear.exists(), "El fichero existe");

        cut.escribir(ruta, datosAEscribir);


        // Verificaba
        assertTrue(ficheroTemporalACrear.exists(), "El fichero no existe");
    
        assertEquals(5478, ficheroTemporalACrear.length(), "No coincide el tamaño");
    }

    @Test
    void testLeerEnBloques() {
        System.out.println("Test2");
    }



    public class FicheroParaTesting2 extends Fichero {

        @Override
        public void hacerElLunes() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'hacerElLunes'");
        }
        
    }
}
