package br.com.objetos;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class Solicitacao {
    @Id
    private String id;

    private Motorista motorista;

    private Cliente cliente;
    private double valor;

    public void calculaKM(double qtd_rodada) {
	this.valor = qtd_rodada * 3.75;
    }
}
