package util;

import java.util.Scanner;

public class Sout {
    private static Scanner sc= new Scanner(System.in);

    public static String interactuar(String text){
        System.out.println("Introduzca "+text);
        String exit=sc.nextLine();
        return exit;
    }

    public static int interIntactuar(String text){

        System.out.println("Introduzca "+text);
        int exit=sc.nextInt();
        return exit;
    }

}
