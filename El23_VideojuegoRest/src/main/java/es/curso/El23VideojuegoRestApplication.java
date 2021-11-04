package es.curso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class El23VideojuegoRestApplication {

    public static void main(String[] args) {
        System.out.println("Servicio Rest -> Cargando el contexto de Spring...");
        SpringApplication.run(El23VideojuegoRestApplication.class, args);
        System.out.println("Servicio Rest -> Contexto de Spring cargado!");
    }

}
