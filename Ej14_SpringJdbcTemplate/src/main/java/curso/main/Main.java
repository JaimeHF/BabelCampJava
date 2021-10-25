package curso.main;

import curso.Config.Configuracion;
import curso.modelo.entidades.Cliente;
import curso.modelo.entidades.Pedido;
import curso.modelo.negocio.GestorCliente;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class Main {

    private static Scanner sc=new Scanner(System.in);
    private static ApplicationContext context;
    private static GestorCliente gc;
    private static Cliente c;
    public static void main(String[] args) {

         context= new AnnotationConfigApplicationContext(Configuracion.class);
         c= context.getBean("cliente",Cliente.class);

        Pedido p= context.getBean("pedido", Pedido.class);
        boolean flag=true;
        int opcion =0;

        do{
            System.out.println("¿Que quieres hacer?\n" +
                    "1: Dar de alta un cliente.\n" +
                    "2: Dar de baja un cliente.\n "+
                    "3: Modificar un cliente.\n" +
                    "4: Listar clientes.\n" +
                    "5: Buscar un cliente por ID.\n"+
                    "6: Anadir un pedido a un cliente.\n" +
                    "7: Listar los pedidos de un cliente.\n" +
                    "8: Salir");
            opcion=sc.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("DAR DE ALTA UN CLIENTE");
                    newCliente();
                    break;
                case 2:
                    System.out.println("DAR DE BAJA UN CLIENTE");
                    deleteCliente();;
                    break;
                case 3:
                    System.out.println("MODIFICAR UN CLIENTE");
                    updateCliente();
                    break;
                case 4:
                    System.out.println("LISTAR CLIENTES");

                    break;
                case 5:
                    System.out.println("BUSCAR UN CLIENTE POR ID");
                    obtener();
                    break;
                case 6:
                    System.out.println("AÑADIR PEDIDO A UN CLIENTE");
                    break;
                case 7:
                    System.out.println("LISTAR PEDIDOS DE UN CLIENTE");
                    break;
                case 8:
                    flag=false;
                    break;
            }

        }while (flag);

    }
    public static void newCliente(){
        GestorCliente gc= context.getBean("gestorCliente", GestorCliente.class);
        System.out.println("Introduzca nombre");
        sc.nextLine();
        c.setNombre(sc.nextLine());
        System.out.println("Edad");
        c.setEdad(sc.nextInt());
        gc.insertar(c);
    }

    public static void deleteCliente(){
        GestorCliente gc= context.getBean("gestorCliente", GestorCliente.class);
        System.out.println("Introduzca el Id del cliente para borrarlo");
        gc.borrar(sc.nextInt());
    }

    public static void updateCliente(){
        GestorCliente gc= context.getBean("gestorCliente", GestorCliente.class);
        System.out.println("Introduzca el Id del cliente para modificarlo");
        int id=sc.nextInt();
        if(gc.obtener(id)!=null){
            System.out.println("Introduzca nombre");
            sc.nextLine();
            c.setNombre(sc.nextLine());
            System.out.println("Edad");
            c.setEdad(sc.nextInt());
            gc.modificar(c,id);
        }
    }

    public static void obtener(){
        GestorCliente gc= context.getBean("gestorCliente", GestorCliente.class);
        System.out.println("Introduzca el Id del cliente");
        int id=sc.nextInt();
        gc.obtener(id);
    }
}
