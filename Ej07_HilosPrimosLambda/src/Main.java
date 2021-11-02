import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        int num3;

        System.out.println("Introduzca tres numeros y le diremos si son primo");

        System.out.println("Introduzca el primer numero");
        num1 = sc.nextInt();
        Hilo h1 = new Hilo(num1);
        Thread t1 = new Thread(h1.primo);
        t1.setName("hilo 1");

        System.out.println("Introduzca el primer segundo");
        num2 = sc.nextInt();
        Hilo h2 = new Hilo(num2);
        Thread t2 = new Thread(h2.primo);
        t2.setName("hilo 2");

        System.out.println("Introduzca el primer tercero");
        num3 = sc.nextInt();
        Hilo h3 = new Hilo(num3);
        Thread t3 = new Thread(h3.primo);
        t3.setName("hilo 3");


        t1.start();
        t2.start();
        t3.start();
    }
}
