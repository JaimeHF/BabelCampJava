package Armas;

import Armas.Arma;

public class Hechizo extends Arma {


    public Hechizo(double damage) {
        super(damage);
        setTipo("Hechizo");
    }

    public double usarArma() {
        return getDamage();
    }
}
