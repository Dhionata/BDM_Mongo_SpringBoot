package br.com.objetos;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class Cliente {
    @Id
    private String id;
    private String nome;
    private String telefone;
    private String local;

}
