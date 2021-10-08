package VideoJuego;

public class Hechizo extends Arma {


    public Hechizo(double damage) {
        super(damage);
        setTipo("Hechizo");
    }

    public double usarArma() {
        return getDamage();
    }
}
