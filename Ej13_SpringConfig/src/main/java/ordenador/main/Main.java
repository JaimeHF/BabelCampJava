package ordenador.main;

import ordenador.cfg.Configuracion;
import ordenador.modelo.entity.Ordenador;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ordenador.modelo.persistencia.DaoOrdenador;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(Configuracion.class);

        Ordenador o = context.getBean("ordenador", Ordenador.class);
        o.setPrecio(o.calcularPrecioComponentes());
        System.out.println(o);

        DaoOrdenador daO = context.getBean("dao", DaoOrdenador.class);
        System.out.println(daO.guardar(o));

    }
}
