package util;

public class Randoms {

    private String[] nombres = {"Bellota", "Nisu", "Tortola", "Delmon", "Alfi", "LG", "Logitech", "Asus", "DELL"};

    public String randomNombre() {
        return nombres[(int) Math.floor(Math.random() * (nombres.length))];
    }

    public double randomsPrecio() {
        return Math.floor(Math.random() * 200);
    }
}
