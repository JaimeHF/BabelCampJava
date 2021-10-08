package VideoJuego;

public class Espada extends Arma{


    public Espada(double damage) {
        super(damage);
        setTipo("Espada");
    }


    @Override
    public double usarArma() {
        return getDamage();
    }
}
