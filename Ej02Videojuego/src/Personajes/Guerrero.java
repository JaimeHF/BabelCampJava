package Personajes;

import Armas.Arma;

import java.util.List;

public class Guerrero extends Jugador {

    private String atributo;

    public Guerrero(String nombre, double vida, List<Arma> listArma) {
        super(nombre, vida, listArma);
        atributo = "Fuerza";
    }

    @Override
    public String toString() {
        return "Guerrero{ atributo=" + atributo + " nombre: " + getNombre() + "}";
    }


    @Override
    public double atacar(int e) {
        int ramdon = e;

        if (getListArma().get(ramdon).getTipo().equals("Espada") || getListArma().get(ramdon).getTipo().equals("Arco")) {
            return 12 + getListArma().get(ramdon).usarArma();
        } else {
            return getListArma().get(ramdon).usarArma();
        }

    }

}
