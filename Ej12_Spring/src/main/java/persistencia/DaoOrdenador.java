package persistencia;

import entity.Ordenador;

import java.io.*;

public class DaoOrdenador {
    public String guardar(Ordenador o){

        try {
            FileOutputStream fos = new FileOutputStream("src/main/resources/Ordenador.txt");
            ObjectOutputStream oos= new ObjectOutputStream(fos);

            oos.writeObject(o.toString());
            oos.flush();
            oos.close();
            fos.close();
            return "Ordenador guardado";
        } catch (IOException e) {
            e.printStackTrace();
            return "No se ha podido guardar";
        }

    }

}
