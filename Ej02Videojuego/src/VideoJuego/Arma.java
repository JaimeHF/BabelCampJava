package VideoJuego;

public abstract class Arma {

    private double damage;
    private String tipo;

    public Arma(double damage) {
        this.damage = damage;
        this.tipo = tipo;
    }

    public double getDamage() {
        return damage;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }



    public abstract double usarArma();
}
