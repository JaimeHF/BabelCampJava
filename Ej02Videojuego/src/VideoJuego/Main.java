package VideoJuego;

import Armas.*;
import Personajes.Guerrero;
import Personajes.Mago;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Creando armas para guerrero
        Espada e1=new Espada(20);
        Hechizo h1=new Hechizo(15);
        Arco a1=new Arco(10);
        Rezo r1=new Rezo(25);
        List<Arma> listArma=List.of(e1,h1,a1,r1);

        //Creando Guerrero
        Guerrero g1=new Guerrero("Konan",100,listArma);

        //Creando armas para mago
        Hechizo h2=new Hechizo(15);
        Espada e2=new Espada(20);
        Arco a2=new Arco(10);
        Rezo r2=new Rezo(15);
        List<Arma> listArmaMago=List.of(e2,h2,a2,r2);

        //Creando mago
        Mago m1=new Mago("Merlin",100,listArmaMago);


       do{
                //Turnos aleatorios
            int ramdon= (int)(Math.random()*10+1);

            if(ramdon%2==0){
                int ram=(int)(Math.random()*listArma.size());
                double damageVida=m1.atacar(ram);
                System.out.println(m1.getNombre()+" ataca con "+m1.getListArma().get(ram).getTipo() +" quitando "+damageVida+" de daño a "+g1.getNombre());
                g1.setVida(g1.getVida()- damageVida);
                System.out.println(g1.getNombre()+" le queda "+g1.getVida()+ " de vida");
            }else{
                int ram=(int)(Math.random()*listArma.size());
                double damageVida=g1.atacar(ram);
                System.out.println(g1.getNombre()+" ataca con "+g1.getListArma().get(ram).getTipo() +" quitando "+damageVida+" de daño a "+m1.getNombre());
                m1.setVida(m1.getVida()- damageVida);
                System.out.println(m1.getNombre()+" le queda "+m1.getVida()+ " de vida");
            }

        } while(m1.getVida()>0&&g1.getVida()>0);


        if(m1.getVida()<0){
            System.out.println(g1.getNombre()+" WIN");
        }else{
            System.out.println(m1.getNombre()+" WIN");
        }


    }
}
