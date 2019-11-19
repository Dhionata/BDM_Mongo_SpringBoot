package br.com.objetos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {

    public static void main(String[] args) {
	System.out.println("Iniciando Spring Boot...");
	SpringApplication.run(App.class, args);
    }
}
