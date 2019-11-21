package br.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.App.CarroRepository;
import br.com.App.MotoristaRepository;
import br.com.objetos.Motorista;

@RestController
public class MotoristaController {
    // AutoWired necessário em TODOS os repositórios
    @Autowired
    private MotoristaRepository repository;
    @Autowired
    private CarroRepository carros;
    @Autowired
    private CarroController Cc = new CarroController();
    private Motorista m1 = new Motorista();
    private Motorista m2 = new Motorista();

    @RequestMapping("/motorista")
    public List<Motorista> monstrarTodos() {
	System.out.println("mostrou \n" + repository.findAll());
	List<Motorista> clientes = repository.findAll();
	return clientes;
    }

    @RequestMapping("/motorista/adicionar")
    public void adicionar() {
	Cc.remover();
	System.out.println("Carros excluídos para não duplicação!\n");
	Cc.adicionar();
	System.out.println("Criado o CarroController\n");
	m1.setNome("Allan");
	m1.setCarro(carros.findByModelo("Skyline"));
	repository.save(m1);
	System.out.println("Adicionado " + m1);

	m2.setNome("Murillo");
	m2.setCarro(carros.findByModelo("Skyline"));
	repository.save(m2);
	System.out.println("Adicionado " + m2);
    }

    @RequestMapping("/motorista/remover")
    public void remover() {
	System.out.println("Removeu \n" + monstrarTodos());
	repository.deleteAll();
    }
}