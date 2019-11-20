package br.com.objetos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Cliente {
    @Autowired
    @Id
    private String id;
    private String nome;
    private String telefone;
    private String local;

}
