package br.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.App.CarroRepository;
import br.com.objetos.Carro;

@RestController
public class CarroController {
    // Autowired necessário em TODOS os repositórios
    @Autowired
    private CarroRepository repository;

    private Carro c1 = new Carro();

    private Carro c2 = new Carro();

    @RequestMapping("/carro/adicionar")
    public void adicionar() {
	this.remover();
	System.out.println("\nCarros excluídos para não duplicação!\n");

	c1.setModelo("350z");
	c1.setCor("Laranja");
	c1.setMarca("Nissan");
	repository.save(c1);
	System.out.println("\nAdicionado \n" + c1);

	c2.setModelo("Skyline");
	c2.setCor("Amarelo");
	c2.setMarca("Nissan");
	repository.save(c2);
	System.out.println("\nAdicionado \n" + c2);
    }

    @RequestMapping("/carro")
    public List<Carro> monstrarTodos() {
	System.out.println(repository.findAll());
	return repository.findAll();
    }

    @RequestMapping("/carro/remover")
    public void remover() {
	System.out.println("\nRemoveu \n" + monstrarTodos());
	repository.deleteAll();
    }
}