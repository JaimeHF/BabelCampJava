public class Hilo extends Thread {
    private int num;

    public Hilo(int num) {
        this.num = num;
    }

    Runnable primo = () -> {

        boolean primo = true;
        System.out.println("Comienza el " + Thread.currentThread().getName());
        long inicio = System.currentTimeMillis();
        if (num <= 2) {
            primo = false;
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    primo = false;
                    break;
                }
            }
        }

        long fin = System.currentTimeMillis();
        double tiempo = (double) ((fin - inicio));
        if (primo) {
            System.out.println(num + " es primo. Ha tardado en calcularlo " + tiempo + " milisegundos");
        } else {
            System.out.println(num + " no es primo. Ha tardado en calcularlo " + tiempo + " milisegundos");
        }
    };
}
