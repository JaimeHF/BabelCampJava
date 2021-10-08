package Personajes;

import Armas.Arma;

import java.util.List;

public class Mago extends Jugador{
    private String atributo;

    public Mago(String nombre, double vida, List<Arma> listArma) {
        super(nombre, vida, listArma);
        atributo = "inteligencia";
    }

    @Override

    public double atacar(int e) {
        int ramdon= e;

        if(getListArma().get(ramdon).getTipo().equals("Hechizo")){
            return 12+getListArma().get(ramdon).usarArma();
        }else {
            return getListArma().get(ramdon).usarArma();
        }

    }
    //public double atacar() {
    //    if(getArma().getTipo().equals("Hechizo")){
    //        return 12+getArma().usarArma();
    //    }else {
    //        return getArma().usarArma();
    //    }
    //}
}
