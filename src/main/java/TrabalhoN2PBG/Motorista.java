package TrabalhoN2PBG;

public class Motorista {

    private int id;
    private String nome;

    private Carro carro;

    public Motorista() {

    }

    public Motorista(String nome, Carro carro) {
	setNome(nome);
	setCarro(carro);
    }

    // Getters e Setters (Melhor usar @Data do Lombok!)
    public int getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
    }

    public String getNome() {
	return nome;
    }

    public void setNome(String nome) {
	this.nome = nome;
    }

    public Carro getCarro() {
	return carro;
    }

    public void setCarro(Carro carro) {
	this.carro = carro;
    }

}
