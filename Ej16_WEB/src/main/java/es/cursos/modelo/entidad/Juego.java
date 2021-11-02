package es.cursos.modelo.entidad;

public class Juego {

    private int id;
    private String nombre;
    private String compa;
    private double notaMedia;
    private String enlace;

    public Juego() {
    }

    public Juego(int id, String nombre, String compa, double notaMedia, String enlace) {
        this.id = id;
        this.nombre = nombre;
        this.compa = compa;
        this.notaMedia = notaMedia;
        this.enlace = enlace;
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

    public String getCompa() {
        return compa;
    }

    public void setCompa(String compa) {
        this.compa = compa;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }

    public String getEnlace() {
        return enlace;
    }

    public void setEnlace(String enlace) {
        this.enlace = enlace;
    }

    @Override
    public String toString() {
        return "Juego{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", compa='" + compa + '\'' +
                ", notaMedia=" + notaMedia +
                ", enlace='" + enlace + '\'' +
                '}';
    }
}
