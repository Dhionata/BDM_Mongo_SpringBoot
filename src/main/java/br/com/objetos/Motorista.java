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
    private boolean banido;

    @DBRef
    private Carro carro;

    @Override
    public String toString() {
	return "\n\n--Motorista--\nID : " + getId() + "\nNome : " + getNome() + "\nBanido: " + isBanido() + "\nCarro : "
		+ getCarro();
    }

}
