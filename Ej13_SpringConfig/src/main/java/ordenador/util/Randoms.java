package ordenador.util;

public class Randoms {

    private static String[] nombres = {"Bellota", "Nisu", "Tortola", "Delmon", "Alfi", "LG", "Logitech", "Asus", "DELL"};

    public static String randomNombre() {
        return nombres[(int) Math.floor(Math.random() * (nombres.length))];
    }

    public static double randomsPrecio() {
        return Math.floor(Math.random() * 200);
    }
}
