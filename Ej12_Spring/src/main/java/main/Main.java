package main;

import entity.Ordenador;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import persistencia.DaoOrdenador;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Ordenador o= context.getBean("Ordenador",Ordenador.class);
        System.out.println(o);
        System.out.println("Precio por componentes: "+o.calcularPrecioComponentes());

        DaoOrdenador daO = context.getBean("DaoOrdenador",DaoOrdenador.class);
        System.out.println(daO.guardar(o));

    }
}
