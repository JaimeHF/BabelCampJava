import java.sql.SQLOutput;

public class Hilo  extends Thread{
    private int num;

    public Hilo(int num){
        this.num=num;
    }

    @Override
    public void run() {
        boolean primo=true;
        System.out.println("Comienza el hilo "+Thread.currentThread().getName());
        long inicio=System.currentTimeMillis();
        for (int i=2; i<num; i++) {
            if (num % i == 0) {
                primo = false;
            }
        }
        long fin =System.currentTimeMillis();
        double tiempo = (double) ((fin - inicio));
        if(primo){
            System.out.println(num+ " es primo. Ha tardado en calcularlo "+tiempo+" milisegundos");
        }else{
            System.out.println(num+" no es primo. Ha tardado en calcularlo "+tiempo+" milisegundos");
        }
    }
}
