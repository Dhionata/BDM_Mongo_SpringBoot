package TrabalhoN2PBG;

public class Cliente {

    private int id;
    private String nome;
    private String telefone;
    private String local;

    public Cliente() {

    }

    public Cliente(String nome, String telefone, String local) {
	setNome(nome);
	setTelefone(telefone);
	setLocal(local);
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

    public String getLocal() {
	return local;
    }

    public void setLocal(String local) {
	this.local = local;
    }

    public String getTelefone() {
	return telefone;
    }

    public void setTelefone(String telefone) {
	this.telefone = telefone;
    }

}
