import modelo.entidad.Avion;
import modelo.entidad.Barco;
import modelo.entidad.CocheMoto;
import modelo.entidad.Vehiculo;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehiculo> listVehiculo = new ArrayList<Vehiculo>();
        Scanner sc=new Scanner(System.in);
        listVehiculo.add(new CocheMoto(0,110,"Opel"));
        listVehiculo.add(new CocheMoto(1,65,"Triumph"));
        listVehiculo.add(new Barco(2,15000,"Titanic"));
        listVehiculo.add(new Avion(3,11000,"Airbus A400M"));
        System.out.println("Introduzca un numero que sera el impulso para los vehiculos");
        int num= sc.nextInt();


        for(int i=0;i<listVehiculo.size();i++){
            System.out.println(listVehiculo.get(i).mover(num));

        }
    }
}
