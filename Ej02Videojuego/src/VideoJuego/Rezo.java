package VideoJuego;

public class Rezo extends Arma{

    public Rezo(double damage) {
        super(damage);
        setTipo("Rezo");
    }

    @Override
    public double usarArma() {
        return getDamage();
    }
}
