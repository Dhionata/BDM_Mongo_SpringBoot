package br.com.App;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan(basePackages = { "br.com.objetos" })
@ComponentScan(basePackages = { "br.com.controller" })

public class App {
    // Test
    public static void main(String[] args) {
	System.out.println("Iniciando Spring Boot...");
	SpringApplication.run(App.class, args);
    }
}
