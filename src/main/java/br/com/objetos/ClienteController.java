package br.com.objetos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {
    @Autowired
    private ClienteRepository repository;

    @RequestMapping("/cliente")
    public List<Cliente> monstrarTodos() {
	System.out.println("mostrou" + repository.findAll());
	List<Cliente> clientes = repository.findAll();
	return clientes;
    }

    @RequestMapping("/cliente/adicionar")
    public void adicionar() {
	Cliente cl1 = new Cliente();
	cl1.setNome("Marcos");
	cl1.setTelefone("(62)99999-9999");
	cl1.setLocal("Goiânia");
	repository.save(cl1);
	System.out.println("Adicionado " + cl1.getNome());
	Cliente cl2 = new Cliente();
	cl2.setNome("Murillo");
	cl2.setTelefone("(62)98888-8888");
	cl2.setLocal("Edeia");
	repository.save(cl2);
	System.out.println("Adicionado " + cl2.getNome());
    }

    @RequestMapping("/cliente/remover")
    public void remover() {
	System.out.println("Removeu " + monstrarTodos());
	repository.deleteAll();
    }
}