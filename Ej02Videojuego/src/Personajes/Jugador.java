package Personajes;

import Armas.Arma;

import java.util.List;

public abstract class Jugador {
    private String nombre;
    private double vida;
    //private Arma arma;
    private List<Arma> listArma;

    public Jugador(String nombre, double vida, List<Arma> listArma) {
        this.nombre = nombre;
        this.vida = vida;
       // this.arma = arma;
        this.listArma=listArma;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public List<Arma> getListArma() {
        return listArma;
    }

    public void setListArma(List<Arma> listArma) {
        this.listArma = listArma;
    }

    //public Arma getArma() {
    //    return arma;
    //}

   // public void setArma(Arma arma) {
   //     this.arma = arma;
   // }

    public abstract double atacar(int e);
}
