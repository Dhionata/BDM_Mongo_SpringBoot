package br.com.objetos;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Solicitacao {
    @Id
    private String id;
    @DBRef
    private Motorista motorista;
    @DBRef
    private Cliente cliente;
    @SuppressWarnings("unused")
    private double valor;

    public void calculaKM(double qtd_rodada) {
	this.valor = qtd_rodada * 3.75;
    }

    @Override
    public String toString() {
	return "\n\n--Solicitacao--\nID : " + getId() + "\nMotorista : " + getMotorista() + "\nCliente : "
		+ getCliente() + "\nValor : " + getValor();
    }
}
