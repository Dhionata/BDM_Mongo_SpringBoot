package TrabalhoN2PBG;

public class Solicitacao {

    private long id;

    private Motorista motorista;

    private Cliente cliente;
    private double valor;

    public Solicitacao() {

    }

    public Solicitacao(Motorista motorista, Cliente cliente, double valor) {
	setMotorista(motorista);
	setCliente(cliente);
	calculaKM(valor);
    }

    public long getId() {
	return id;
    }

    public void setId(long id) {
	this.id = id;
    }

    public Motorista getMotorista() {
	return motorista;
    }

    public void setMotorista(Motorista motorista) {
	this.motorista = motorista;
    }

    public Cliente getCliente() {
	return cliente;
    }

    public void setCliente(Cliente cliente) {
	this.cliente = cliente;
    }

    public double getValor() {
	return valor;
    }

    public void setValor(double valor) {
	this.valor = valor;
    }

    public void calculaKM(double qtd_rodada) {
	this.valor = qtd_rodada * 3.75;
    }
}
