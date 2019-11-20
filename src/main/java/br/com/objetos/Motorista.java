package br.com.objetos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Motorista {

    @Autowired
    @Id
    private String id;

    @Autowired
    private String nome;

    @Autowired
    @DBRef
    private Carro carro;

}
