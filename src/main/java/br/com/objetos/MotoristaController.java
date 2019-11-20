package br.com.objetos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MotoristaController {
    @Autowired
    private MotoristaRepository repository;
    @Autowired
    private CarroController carros;
    @Autowired
    private Motorista m1 = new Motorista();
    @Autowired
    private Motorista m2 = new Motorista();

    @RequestMapping("/motorista")
    public List<Motorista> monstrarTodos() {
	System.out.println("mostrou" + repository.findAll());
	List<Motorista> clientes = repository.findAll();
	return clientes;
    }

    @RequestMapping("/motorista/adicionar")
    public void adicionar() {
	m1.setNome("Allan");
	m1.setCarro(carros.findByModelo("Skyline"));
	repository.save(m1);
	System.out.println("Adicionado " + m1.getNome());

	m2.setNome("Murillo");
	m2.setCarro(carros.findByModelo("Skyline"));
	repository.save(m2);
	System.out.println("Adicionado " + m2.getNome());
    }

    @RequestMapping("/motorista/remover")
    public void remover() {
	System.out.println("Removeu " + monstrarTodos());
	repository.deleteAll();
    }
}