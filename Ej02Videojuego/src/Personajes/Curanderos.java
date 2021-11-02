package Personajes;

import Armas.Arma;

import java.util.List;

public class Curanderos extends Jugador {
    private String atributo;

    public Curanderos(String nombre, double vida, List<Arma> listArma) {
        super(nombre, vida, listArma);
        atributo = "inteligencia";
    }

    @Override


    public double atacar(int e) {
        int ramdon = e;

        if (getListArma().get(ramdon).getTipo().equals("Rezo")) {
            return 12 + getListArma().get(ramdon).usarArma();
        } else {
            return getListArma().get(ramdon).usarArma();
        }

    }

}
