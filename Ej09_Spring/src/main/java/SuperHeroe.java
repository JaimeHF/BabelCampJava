public class SuperHeroe {

    private int id;
    private String nombre;
    private String nombreHeroe;
    private int poder;
    private String superPoder;


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

    public String getNombreHeroe() {
        return nombreHeroe;
    }

    public void setNombreHeroe(String nombreHeroe) {
        this.nombreHeroe = nombreHeroe;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public String getSuperPoder() {
        return superPoder;
    }

    public void setSuperPoder(String superPoder) {
        this.superPoder = superPoder;
    }

    @Override
    public String toString() {
        return "SuperHeroe{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", nombreHeroe='" + nombreHeroe + '\'' +
                ", poder=" + poder +
                ", superPoder='" + superPoder + '\'' +
                '}';
    }
}
