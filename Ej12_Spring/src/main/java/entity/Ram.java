package entity;

public class Ram {
    private double precio;
    private double hz;
    private String marca;

    public Ram(){}
    public Ram(double precio, double hz, String marca) {
        this.precio = precio;
        this.hz = hz;
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getHz() {
        return hz;
    }

    public void setHz(double hz) {
        this.hz = hz;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Ram{" +
                "precio=" + precio +
                ", hz=" + hz +
                ", marca='" + marca + '\'' +
                '}';
    }
}
