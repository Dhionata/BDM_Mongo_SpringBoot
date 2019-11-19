package br.com.objetos;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class Carro {
    @Id
    private String id;
    private String modelo;
    private String marca;
    private String cor;
}
