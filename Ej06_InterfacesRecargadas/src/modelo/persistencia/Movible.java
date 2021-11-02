package modelo.persistencia;

public interface Movible {


    default public String mover(int metros) {
        return "Se ha movido " + metros + " metros";
    }
}
