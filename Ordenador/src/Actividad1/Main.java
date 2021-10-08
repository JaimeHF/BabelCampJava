package Actividad1;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Ram r1=new Ram(50.23, 60, "nisu");
        Ram r2 =new Ram(50.23, 60, "nisu");
        Ram r3 =new Ram(70.23, 90, "nisu");
        Ram r4 =new Ram(70.23, 90, "nisu");
        List<Ram> listRam=List.of(r2,r3);

        Periferico pantalla=new Periferico("Pantalla",100, "LG");
        Periferico teclado =new Periferico("Teclado", 30,"Muela");
        Periferico raton = new Periferico("Raton", 15,"Muela");
        List<Periferico> listPeriferico=List.of(pantalla,teclado,raton);


        TarjetaGrafica t1=new TarjetaGrafica(200, "otra",r1,"ultimo");
        TarjetaGrafica t2=new TarjetaGrafica(500,"Grafica",r4,"ultimo");
        TarjetaGrafica t3=new TarjetaGrafica(500,"Grafica",r4,"ultimo");
        List<TarjetaGrafica> listTarjetaGrafica=List.of(t2,t3);

        Procesador P1 = new Procesador(300, 100,"bellonta",t1);

        PlacaBase pb1=new PlacaBase(100,"madre","placa");



        Ordenador o1= new Ordenador(1000,"Pchanchu",listRam,listTarjetaGrafica,listPeriferico,pb1,P1);

        System.out.println(o1.getPrecio());
        System.out.println(o1.calcularPrecioComponentes());
    }
}
