package ordenador.main;

import ordenador.cfg.Configuracion;
import ordenador.modelo.entity.Ordenador;
import ordenador.modelo.persistencia.DaoOrdenador;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Ordenador o = context.getBean("Ordenador", Ordenador.class);
        o.setPrecio(o.calcularPrecioComponentes());
        System.out.println(o);

        DaoOrdenador daO = context.getBean("dao", DaoOrdenador.class);
        System.out.println(daO.guardar(o));

    }
}
