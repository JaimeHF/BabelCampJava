package ordenador.cfg;

import jdk.jshell.execution.Util;
import ordenador.modelo.entity.*;
import ordenador.modelo.persistencia.DaoOrdenador;
import ordenador.util.Randoms;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class Configuracion {


    //---------------Creacion de Rams----------------
    @Bean
    public Ram ram1(){
        Ram ram= new Ram( Randoms.randomsPrecio(),60, Randoms.randomNombre());
        return ram;
    }
    @Bean
    public Ram ram2(){
        Ram ram= new Ram( Randoms.randomsPrecio(),60, Randoms.randomNombre());
        return ram;
    }
    @Bean
    public Ram ram3(){
        Ram ram= new Ram( Randoms.randomsPrecio(),60,Randoms.randomNombre());
        return ram;
    }
    @Bean
    public Ram ram4(){
        Ram ram= new Ram( Randoms.randomsPrecio(),60,Randoms.randomNombre());
        return ram;
    }
    @Bean
    public Ram ram5(){
        Ram ram= new Ram( Randoms.randomsPrecio(),60,Randoms.randomNombre());
        return ram;
    }

    //--------------------Listado de Rams-------------------------------
    @Bean
    public List<Ram> ramList(@Qualifier("ram3") Ram ram3,@Qualifier("ram4") Ram ram4){
        return List.of(ram3,ram4);
    }

    //----------------Lista de perifericos----------------
    @Bean
    public Periferico raton(){
        Periferico raton = new Periferico("Raton",Randoms.randomsPrecio(),Randoms.randomNombre());
        return raton;
    }
    @Bean
    public Periferico monitor(){
        Periferico monitor = new Periferico("monitor",Randoms.randomsPrecio(),Randoms.randomNombre());
        return monitor;
    }
    @Bean
    public Periferico teclado(){
        Periferico teclado = new Periferico("teclado",Randoms.randomsPrecio(),Randoms.randomNombre());
        return teclado;
    }

    @Bean
    public List<Periferico> perifericoList(@Qualifier("raton") Periferico raton,@Qualifier("monitor") Periferico monitor,@Qualifier("teclado") Periferico teclado){
        return List.of(raton,monitor,teclado);
    }


    //---------------------Creacion de tarjetas graficas------------------
    @Bean
    public TarjetaGrafica tarjetaGrafica1(@Qualifier("ram1") Ram ram){
        TarjetaGrafica tg=new TarjetaGrafica( Randoms.randomsPrecio(), Randoms.randomNombre(),ram,"Geafica");
        return tg;
    }
    @Bean
    public TarjetaGrafica tarjetaGrafica2(@Qualifier("ram2") Ram ram){
        TarjetaGrafica tg=new TarjetaGrafica( Randoms.randomsPrecio(), Randoms.randomNombre(),ram,"Geafica");
        return tg;
    }
    @Bean
    public TarjetaGrafica tarjetaGrafica3(@Qualifier("ram5") Ram ram){
        TarjetaGrafica tg=new TarjetaGrafica( Randoms.randomsPrecio(), Randoms.randomNombre(),ram,"Geafica");
        return tg;
    }

    //---------------Lista de tarjetas Graficas---------------

    @Bean
    public List<TarjetaGrafica> tarjetaGraficaList(@Qualifier("tarjetaGrafica1") TarjetaGrafica tarjetaGrafica1,@Qualifier("tarjetaGrafica2") TarjetaGrafica tarjetaGrafica2){
        return List.of(tarjetaGrafica1,tarjetaGrafica2);
    }

    //--------------Creacion de procesador-------------------

    @Bean
    public Procesador procesador(@Qualifier("tarjetaGrafica3") TarjetaGrafica tarjetaGrafica3){
        Procesador p = new Procesador(Randoms.randomsPrecio(),60,Randoms.randomNombre(),tarjetaGrafica3);
        return p;
    }

    //-----------------------------Creacion Placa base-----------
    @Bean
    public PlacaBase placaBase(){
        PlacaBase pb = new PlacaBase(Randoms.randomsPrecio(),Randoms.randomNombre(),"Placa base");
        return pb;
    }

    //------------------Creacion del ordenador----------------
    @Bean
    public Ordenador ordenador(List<Ram> ramList,List<TarjetaGrafica> tarjetaGraficaList,List<Periferico> perifericoList,PlacaBase placaBase,Procesador procesador){
        Ordenador o= new Ordenador(1000,Randoms.randomNombre(),ramList,tarjetaGraficaList,perifericoList,placaBase,procesador);
        return o;
    }


    //----------------DAO ordenador-----------
    @Bean
    public DaoOrdenador dao(){
        DaoOrdenador dao=new DaoOrdenador();
        return dao;
    }


}
