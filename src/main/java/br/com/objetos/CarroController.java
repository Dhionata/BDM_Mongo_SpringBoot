package br.com.objetos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarroController {
    // AutoWired necessário em TODOS os repositórios
    @Autowired
    private CarroRepository repository;
    private Carro c1 = new Carro();
    private Carro c2 = new Carro();

    @RequestMapping("/carro")
    public List<Carro> monstrarTodos() {
	System.out.println("mostrou" + repository.findAll());
	return repository.findAll();
    }

    @RequestMapping("/carro/adicionar")
    public void adicionar() {
	c1.setModelo("350z");
	c1.setCor("Laranja");
	c1.setMarca("Nissan");
	repository.save(c1);
	System.out.println("Adicionado " + c1.getModelo());

	c2.setModelo("Skyline");
	c2.setCor("Amarelo");
	c2.setMarca("Nissan");
	repository.save(c2);
	System.out.println("Adicionado " + c2.getModelo());
    }

    @RequestMapping("/carro/remover")
    public void remover() {
	System.out.println("Removeu " + monstrarTodos());
	repository.deleteAll();
    }
}