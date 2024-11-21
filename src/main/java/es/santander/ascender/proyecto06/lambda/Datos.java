package es.santander.ascender.proyecto06.lambda;

public class Datos {
    private int edad;
    private String nombre;


    //constructor genérico
    public Datos(){


    }
    //constructor 
    public Datos(int edad, String nombre){
        this.edad = edad;
        this.nombre = nombre;

    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
