package es.curso;

import es.curso.modelo.entidad.Coche;
import es.curso.modelo.persistencia.DaoCocheJPAData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class Application implements CommandLineRunner {
    @Autowired
    public DaoCocheJPAData dc;

    @Autowired
    public Coche car;
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        car.setMatricula("1234abc");
        car.setMarca("Opel");
        car.setModelo("Astra");
        car.setKm(125000);
        System.out.println("******* Insertando coche *********");
        car=dc.save(car);
        System.out.println("******* Buscar Coche ***********");
        System.out.println(dc.findById(car.getId()));

        Scanner sc=new Scanner(System.in);
        boolean flag =true;
        int opcion;
        String text;

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
                    System.out.println("DAR DE ALTA un coche\n");
                    System.out.print("Introduzca marca");
                    text=sc.nextLine();
                    car.setMarca(text);
                    System.out.print("Introduzca modelo");
                    text=sc.nextLine();
                    car.setModelo(text);
                    System.out.print("Introduzca Kms");
                    opcion=sc.nextInt();
                    car.setKm(opcion);
                    System.out.print("Introduzca matricula");
                    text=sc.nextLine();
                    car.setMatricula(text);
                    dc.save(car);
                    System.out.println("Coche dado de alta");
                    break;
                case 2:
                    System.out.print("Introduzca el ID del coche a borrar");
                    opcion=sc.nextInt();
                    dc.deleteById(opcion);
                    System.out.println("Coche borrado");



                    break;
                case 3:
                    System.out.println("Introduce el ID del coche que quieres ver");
                    opcion=sc.nextInt();
                    System.out.println(dc.findById(opcion));
                    break;

                case 4:
                    System.out.print("Quieres cambiar la marca (y/n): ");
                    text=sc.nextLine();
                    if (text.equals("y")){
                        System.out.print("Introduzca marca");
                        text=sc.nextLine();
                        car.setMarca(text);
                    }
                    System.out.print("Quieres cambiar la modelo (y/n): ");
                    text=sc.nextLine();
                    if (text.equals("y")){
                        System.out.print("Introduzca modelo");
                        text=sc.nextLine();
                        car.setModelo(text);
                    }
                    System.out.print("Quieres cambiar la Kms (y/n): ");
                    text=sc.nextLine();
                    if (text.equals("y")){
                        System.out.print("Introduzca Kms");
                        opcion=sc.nextInt();
                        car.setKm(opcion);
                    }
                    System.out.print("Quieres cambiar la matricula (y/n): ");
                    text=sc.nextLine();
                    if (text.equals("y")){
                        System.out.print("Introduzca matricula");
                        text=sc.nextLine();
                        car.setMatricula(text);
                    }
                    dc.save(car);
                    System.out.println("Coche dado de alta");
                    break;
                case 5:
                    System.out.println(dc.findAll());
                    break;

                case 6:
                    System.out.println("Saldra de la aplicación");
                    flag=false;
                    break;
            }

        } while (flag);

    }
}
