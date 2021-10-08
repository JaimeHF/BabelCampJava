package VideoJuego;

public class Arco extends Arma{

    public Arco(double damage) {
        super(damage);
        setTipo("Arco");
    }

    @Override
    public double usarArma() {
        return getDamage();
    }
}
