package es.santander.ascender.proyecto06;

import java.util.ArrayList;
import java.util.List;

public class Arreglo {
    public List<String> localizaDuplicados(List<String> lista1, List<String> lista2) {
        ArrayList<String> resultado = new ArrayList<>();

        for (String valor1: lista1) {
            if(lista2.contains(valor1)) {
                if (!resultado.contains(valor1)) {
                    resultado.add(valor1); 
                }
            }
        }
        return resultado;
    }
}
