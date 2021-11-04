package es.curso.modelo.entidad;

public class Juego {
    private int id;
    private String nombre;
    private String compania;
    private double nota;
    private double precio;



    public Juego() {
    }

    public Juego(int id, String nombre, String compania, double nota, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.compania = compania;
        this.nota = nota;
        this.precio = precio;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }



    @Override
    public String toString() {
        return "Juego{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", compania='" + compania + '\'' +
                ", nota=" + nota +
                ", precio=" + precio +
                '}';
    }
}
