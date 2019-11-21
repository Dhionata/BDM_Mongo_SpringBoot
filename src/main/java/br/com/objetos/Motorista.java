package br.com.objetos;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Motorista {

    @Id
    private String id;
    private String nome;
    @DBRef
    private Carro carro;

}
