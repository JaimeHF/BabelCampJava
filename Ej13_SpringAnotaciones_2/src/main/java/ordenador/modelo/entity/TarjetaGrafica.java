package ordenador.modelo.entity;

public class TarjetaGrafica {
    private double precio;
    private String marca;
    private Ram ram;
    private String modelo;

    public TarjetaGrafica() {
    }

    public TarjetaGrafica(double precio, String marca, Ram ram, String modelo) {
        this.precio = precio;
        this.marca = marca;
        this.ram = ram;
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "TarjetaGrafica{" +
                "precio=" + precio +
                ", marca='" + marca + '\'' +
                ", ram=" + ram +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
