package es.curso.modelo.entidad;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component
@Scope("prototype")

@Entity
@Table(name="coches")
public class Coche {

    @Id
    @Column(name = "matricula_coche", unique = true)
    private String matricula;
    private String marca;
    private String modelo;
    private int Km;

    public Coche(){}

    public Coche(String matricula, String marca, String modelo, int km) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        Km = km;
    }

    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getNumeroKm() {
        return Km;
    }
    public void setKm(int numeroKm) {
        this.Km = numeroKm;
    }
    @Override
    public String toString() {
        return "Coche [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", numeroKm=" + Km
                + "]";
    }
}
