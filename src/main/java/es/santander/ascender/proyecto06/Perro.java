package es.santander.ascender.proyecto06;

public class Perro {

    private long id;

    private double peso;
 
    public Perro(int id,double peso) {
        // Que pasa en peso 0 o negativo
        this.id = id;
        this.peso = peso;
    }

    public void comer(double pesoComida) {
        this.peso += pesoComida;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (id ^ (id >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Perro other = (Perro) obj;
        if (id != other.id)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Perro [id=" + id + ", peso=" + peso + "]";
    }   
    
    
}
