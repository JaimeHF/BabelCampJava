package ordenador.modelo.entity;

import ordenador.util.Randoms;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("Ordenador")
public class Ordenador {

    double precio;
    @Value("#{Randoms.randomNombre()}")
    String marca;
    @Autowired
    @Qualifier("listaRam")
    List<Ram> listRam;
    @Autowired
    @Qualifier("listaTarjetaGrafica")
    List<TarjetaGrafica> listaTarjetaGrafica;
    @Autowired
    @Qualifier("listaPerifericos")
    List<Periferico> listaPerifericos;
    @Autowired
    @Qualifier("placaBase")
    PlacaBase placaBase;
    @Autowired
    @Qualifier("prodesador")
    Procesador procesador;

    public Ordenador() {
    }

    public Ordenador(double precio, String marca, List<Ram> listRam, List<TarjetaGrafica> listaTarjetaGrafica, List<Periferico> listaPerifericos, PlacaBase placaBase, Procesador procesador) {
        this.precio = precio;
        this.marca = marca;
        this.listRam = listRam;
        this.listaTarjetaGrafica = listaTarjetaGrafica;
        this.listaPerifericos = listaPerifericos;
        this.placaBase = placaBase;
        this.procesador = procesador;
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

    public List<Ram> getListRam() {
        return listRam;
    }

    public void setListRam(List<Ram> listRam) {
        this.listRam = listRam;
    }

    public List<TarjetaGrafica> getListaTarjetaGrafica() {
        return listaTarjetaGrafica;
    }

    public void setListaTarjetaGrafica(List<TarjetaGrafica> listaTarjetaGrafica) {
        this.listaTarjetaGrafica = listaTarjetaGrafica;

    }

    public List<Periferico> getListaPerifericos() {
        return listaPerifericos;
    }

    public void setListaPerifericos(List<Periferico> listaPerifericos) {
        this.listaPerifericos = listaPerifericos;
    }

    public PlacaBase getPlacaBase() {
        return placaBase;
    }

    public void setPlacaBase(PlacaBase placaBase) {
        this.placaBase = placaBase;
    }

    public Procesador getProcesador() {
        return procesador;
    }

    public void setProcesador(Procesador procesador) {
        this.procesador = procesador;
    }

    public double calcularPrecioComponentes() {
        double total = 0;

        double rams = 0;
        double tarjetaGraficas = 0;
        double perifericos = 0;

        for (int i = 0; i < listRam.size(); i++) {
            rams += listRam.get(i).getPrecio();
        }
        for (int i = 0; i < listaTarjetaGrafica.size(); i++) {
            tarjetaGraficas += listaTarjetaGrafica.get(i).getPrecio();
        }
        for (int i = 0; i < listaPerifericos.size(); i++) {
            perifericos += listaPerifericos.get(i).getPrecio();
        }

        total = rams + tarjetaGraficas + perifericos + placaBase.getPrecio() + procesador.getPrecio();
        return total;
    }

    @Override
    public String toString() {
        return "Ordenador{" +
                "precio=" + precio +
                ", marca='" + marca + '\'' +
                ", listRam=" + listRam +
                ", listaTarjetaGrafica=" + listaTarjetaGrafica +
                ", listaPerifericos=" + listaPerifericos +
                ", placaBase=" + placaBase +
                ", procesador=" + procesador +
                '}';
    }
}
