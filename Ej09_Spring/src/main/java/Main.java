import jdk.swing.interop.SwingInterOpUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.naming.Context;
import javax.xml.transform.Source;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static ApplicationContext context =new ClassPathXmlApplicationContext("ApplicationContext.xml");
    public static void main(String[] args) {
        boolean flag=true;
        int opcion;
        String text;
        Scanner sc= new Scanner(System.in);
        SuperHeroe SL = context.getBean("SL",SuperHeroe.class);
        SuperHeroe CE = context.getBean("CE",SuperHeroe.class);
        SuperHeroe DV = context.getBean("DV",SuperHeroe.class);

        List<SuperHeroe> listSuperHeroes= context.getBean("listSuperHeroes", List.class);
        List<SuperHeroe> listSuperHeroesVolar= context.getBean("listSuperHeroesVolar", List.class);
        List<SuperHeroe> listSuperHeroesPoder= context.getBean("listSuperHeroesPoder", List.class);
        listSuperHeroes.add(SL);
        listSuperHeroes.add(CE);
        listSuperHeroes.add(DV);



        do{
            System.out.println("SUPER HEROES\n" +
                    "1: Acceder a los 3 super heroes\n" +
                    "2: Add super heroe con potencia 100 a su lista\n" +
                    "3: Add super heroe que pueda volar a su lista\n" +
                    "4: Listar super heroes con potencia 100\n" +
                    "5: Listar super heroes que puedan volar.\n" +
                    "6: Salir");
            opcion=sc.nextInt();

            switch (opcion){
                case 1:
                    for(SuperHeroe s : listSuperHeroes){
                        System.out.println(s);
                    }
                    break;
                case 2:
                    SuperHeroe s1 = context.getBean("poder100",SuperHeroe.class);
                    System.out.print("Introduzca los siguentes datos\n" +
                            "ID: ");
                    opcion=sc.nextInt();
                    s1.setId(opcion);
                    System.out.print("Nombre: ");
                    text=sc.nextLine();
                    s1.setNombre(text);
                    System.out.print("Nombre Super Heroe: ");
                    text=sc.nextLine();
                    s1.setNombreHeroe(text);
                    System.out.print("Super poder: ");
                    text=sc.nextLine();
                    s1.setSuperPoder(text);
                    listSuperHeroesPoder.add(s1);
                    break;
                case 3:
                    SuperHeroe s2 = context.getBean("volar",SuperHeroe.class);
                    System.out.print("Introduzca los siguentes datos\n" +
                            "ID: ");
                    opcion=sc.nextInt();
                    s2.setId(opcion);
                    System.out.print("Nombre: ");
                    System.out.println("");
                    text=sc.nextLine();
                    s2.setNombre(text);
                    System.out.print("Nombre Super Heroe: ");
                    text=sc.nextLine();
                    s2.setNombreHeroe(text);
                    System.out.print("Poder: ");
                    opcion=sc.nextInt();
                    s2.setPoder(opcion);
                    listSuperHeroesVolar.add(s2);
                    break;
                case 4:
                    for(SuperHeroe s : listSuperHeroesPoder){
                        System.out.println(s);
                    }
                    break;
                case 5:
                    for(SuperHeroe s : listSuperHeroesVolar){
                        System.out.println(s);
                    }
                    break;
                case 6:
                    flag=false;
                    break;

            }
        }while (flag);

    }
}
