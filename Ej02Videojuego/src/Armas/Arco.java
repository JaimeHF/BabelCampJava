package Armas;

import Armas.Arma;

public class Arco extends Arma {

    public Arco(double damage) {
        super(damage);
        setTipo("Arco");
    }

    @Override
    public double usarArma() {
        return getDamage();
    }
}
