package TrabalhoN2PBG;

public class Carro {
    private int id;
    private String modelo;
    private String marca;
    private String cor;

    public Carro() {

    }

    public Carro(String modelo, String marca, String cor) {
	setModelo(modelo);
	setMarca(marca);
	setCor(cor);
    }

    // Getters e Setters (Melhor usar @Data do Lombok!)
    public int getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
    }

    public String getModelo() {
	return modelo;
    }

    public void setModelo(String modelo) {
	this.modelo = modelo;
    }

    public String getMarca() {
	return marca;
    }

    public void setMarca(String marca) {
	this.marca = marca;
    }

    public String getCor() {
	return cor;
    }

    public void setCor(String cor) {
	this.cor = cor;
    }
}
