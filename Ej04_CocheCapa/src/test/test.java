package test;

import modelo.entidad.Coche;
import modelo.negocio.GestorCoche;
import util.Sout;
import java.util.List;

public class test {

    public static void main(String[] args) {

        int opcion = 0;
        boolean flag = true;
        GestorCoche gestorCoche = new GestorCoche();
        Coche car=new Coche();

        do {
            System.out.println("BBDD COCHES\n" +
                    "OPCIONES\n" +
                    "1: Alta coche\n" +
                    "2: Baja coche\n" +
                    "3: Mostrar coche\n" +
                    "4: Modificar coche\n" +
                    "5: Listar todos los coches\n" +
                    "6: Salir");
            opcion = Sout.interIntactuar("Una opcion");


            switch (opcion) {
                case 1:
                    System.out.println("DAR DE ALTA un coche\n");
                    car.setMarca(Sout.interactuar("marca"));
                    car.setModelo(Sout.interactuar("modelo"));
                    car.setKm(Sout.interIntactuar("km"));
                    car.setMatricula(Sout.interactuar("matricula"));

                    boolean alta = gestorCoche.newCar(car);
                    if (alta) {
                        System.out.println("El coche se ha dado de alta");
                    } else {
                        System.out.println("El coche NO se ha dado de alta");
                    }
                    break;
                case 2:
                    System.out.println("DAR DE BAJA un coche\n");
                    boolean eliminar = gestorCoche.deleteCar(Sout.interIntactuar("ID del coche"));
                    if (eliminar) {
                        System.out.println("El coche se ha eliminado");
                    } else {
                        System.out.println("El coche NO se ha eliminado");
                    }
                    break;
                case 3:
                    System.out.println("OBTENER un coche\n");
                    car = gestorCoche.obtener(Sout.interIntactuar("ID del coche"));
                    System.out.println("car: " + car);
                    break;

                case 4:
                    System.out.println("Modifucar un coche\n");
                    car.setId(Sout.interIntactuar("ID del coche"));
                    car.setMarca(Sout.interactuar("marca"));
                    car.setModelo(Sout.interactuar("modelo"));
                    car.setKm(Sout.interIntactuar("km"));
                    car.setMatricula(Sout.interactuar("matricula"));


                    boolean modificar = gestorCoche.updateCar(car);
                    if (modificar) {
                        System.out.println("El coche se ha dado de actualizado");
                    } else {
                        System.out.println("El coche NO se ha dado de actualizado");
                    }
                    break;
                case 5:
                    System.out.println("LISTA DE TODOS los coche\n");
                    List<Coche> listCoche = gestorCoche.listCar();
                    for (Coche c : listCoche) {
                        System.out.println(c);
                    }
                    break;
                case 6:
                    System.out.println("Saldra de la aplicación");
                    flag=false;
                    break;
            }

        } while (flag);

    }

}
