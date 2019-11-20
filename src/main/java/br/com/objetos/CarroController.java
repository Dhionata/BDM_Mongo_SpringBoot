package br.com.objetos;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarroController {
    @Autowired
    private CarroRepository repository;
    private Carro c1 = new Carro();
    private Carro c2 = new Carro();
    private List<Carro> carros = new ArrayList<Carro>();

    @RequestMapping("/carro")
    public List<Carro> monstrarTodos() {
	System.out.println("mostrou" + repository.findAll());
	carros = repository.findAll();
	return carros;
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

    public Carro findByModelo(String modelo) {
	Carro temp = null;
	boolean oi = false;
	carros = repository.findAll();
	for (Carro c : carros) {
	    if (c.getModelo() == modelo) {
		temp = c;
		oi = true;
	    }
	}
	if (oi) {
	    return temp;
	} else
	    return null;
    }

    public List<Carro> findByMarca(String marca) {
	// TODO Auto-generated method stub
	return null;
    }
}