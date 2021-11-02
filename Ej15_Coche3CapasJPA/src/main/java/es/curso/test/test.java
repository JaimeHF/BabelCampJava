package es.curso.test;

import es.curso.cfg.ConfiguracionJPA;
import es.curso.modelo.entidad.Coche;
import es.curso.modelo.negocio.GestorCoche;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;
import java.util.Scanner;

public class test {
    private static ApplicationContext context;
    private static GestorCoche gestorCoche;
    private static Coche car;
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        context = new AnnotationConfigApplicationContext(ConfiguracionJPA.class);
        int opcion = 0;
        boolean flag = true;
        gestorCoche = context.getBean("gestorCoche", GestorCoche.class);
        car = context.getBean("coche", Coche.class);


        do {
            System.out.println("BBDD COCHES\n" +
                    "OPCIONES\n" +
                    "1: Alta coche\n" +
                    "2: Baja coche\n" +
                    "3: Mostrar coche\n" +
                    "4: Modificar coche\n" +
                    "5: Listar todos los coches\n" +
                    "6: salir\n");
            opcion = sc.nextInt();


            switch (opcion) {
                case 1:
                    newCar();
                    break;
                case 2:
                    deleteCar();

                    break;
                case 3:
                    obtener();
                    break;

                case 4:
                    updateCar();
                    break;
                case 5:
                    listar();
                    break;

                case 6:
                    System.out.println("Saldra de la aplicación");
                    flag = false;
                    break;
            }

        } while (flag);

    }

    public static void newCar() {
        System.out.println("DAR DE ALTA un coche\n");
        System.out.print("Introduzca marca");
        sc.nextLine();
        car.setMarca(sc.nextLine());
        System.out.print("Introduzca modelo");
        car.setModelo(sc.nextLine());
        System.out.print("Introduzca Kms");
        car.setKm(sc.nextInt());
        System.out.print("Introduzca matricula");
        sc.nextLine();
        car.setMatricula(sc.nextLine());

        if (gestorCoche.newCar(car)) {
            System.out.println("Coche Creado correctamente");
        } else {
            System.err.println("Error");
        }
    }

    public static void deleteCar() {
        System.out.println("DAR DE BAJA un coche\n");
        System.out.print("Introduzca la matricula del coche a borrar");
        sc.nextLine();
        gestorCoche.deleteCar(sc.nextLine());
        if (gestorCoche.deleteCar(sc.nextLine())) {
            System.out.println("Coche borrado correctamente");
        } else {
            System.err.println("Error");
        }
    }

    public static void updateCar() {
        System.out.println("Modifucar un coche\n");
        System.out.print("Introduzca matricula del coche a modificar");
        sc.nextLine();
        car = gestorCoche.obtener(sc.nextLine());
        if (car != null) {
            System.out.print("Introduzca marca");
            car.setMarca(sc.nextLine());
            System.out.print("Introduzca modelo");
            car.setModelo(sc.nextLine());
            System.out.print("Introduzca Kms");
            car.setKm(sc.nextInt());
            if (gestorCoche.updateCar(car)) {
                System.out.println("Coche modificado correctamente");
            } else {
                System.err.println("Error");
            }
        } else {
            System.out.println("No existe ningun coche con esa matricula en la BBDD");
        }

    }

    public static void obtener() {
        System.out.println("OBTENER un coche\n");
        System.out.print("Introduzca matricula");
        sc.nextLine();
        car = gestorCoche.obtener(sc.nextLine());
        System.out.println("car: " + car);
    }

    public static void listar() {
        System.out.println("LISTA DE TODOS los coche\n");

        List<Coche> listCoche = gestorCoche.listCar();
        for (Coche c : listCoche) {
            System.out.println(c);
        }
    }

}
