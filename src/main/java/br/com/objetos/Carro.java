package br.com.objetos;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Carro {
    @Id
    private String id;
    private String modelo;
    private String marca;
    private String cor;
}