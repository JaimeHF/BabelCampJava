package ordenador.modelo.entity;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


public class Procesador {

    private double precio;
    private double hz;
    private String marca;
    private TarjetaGrafica tarjetaGrafica;

    public Procesador() {
    }

    public Procesador(double precio, double hz, String marca, TarjetaGrafica tarjetaGrafica) {
        this.precio = precio;
        this.hz = hz;
        this.marca = marca;
        this.tarjetaGrafica = tarjetaGrafica;
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

    public TarjetaGrafica getTarjetaGrafica() {
        return tarjetaGrafica;
    }

    public void setTarjetaGrafica(TarjetaGrafica tarjetaGrafica) {
        this.tarjetaGrafica = tarjetaGrafica;
    }

    @Override
    public String toString() {
        return "Procesador{" +
                "precio=" + precio +
                ", hz=" + hz +
                ", marca='" + marca + '\'' +
                ", tarjetaGrafica=" + tarjetaGrafica +
                '}';
    }
}
