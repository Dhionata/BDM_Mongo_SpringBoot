package TrabalhoN2PBG;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarroController {
    @Autowired
    private CarroRepository repository;

    @RequestMapping("/carro")
    public List<Carro> monstrarTodos() {
	System.out.println("mostrou" + repository.findAll());
	List<Carro> carros = repository.findAll();
	return carros;
    }

    @RequestMapping("/carro/adicionar")
    public void adicionar() {
	Carro c1 = new Carro();
	c1.setModelo("350z");
	c1.setCor("Laranja");
	c1.setMarca("Nissan");
	repository.save(c1);
	System.out.println("Adicionado " + c1.getModelo());
	Carro c2 = new Carro();
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