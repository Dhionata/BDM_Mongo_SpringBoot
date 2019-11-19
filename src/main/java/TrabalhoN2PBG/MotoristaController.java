package TrabalhoN2PBG;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MotoristaController {
    @Autowired
    private MotoristaRepository repository;

    @RequestMapping("/motorista")
    public List<Motorista> monstrarTodos() {
	System.out.println("mostrou" + repository.findAll());
	List<Motorista> clientes = repository.findAll();
	return clientes;
    }

    @RequestMapping("/motorista/adicionar")
    public void adicionar() {
	Motorista c1 = new Motorista();
	c1.setNome("Allan");
	c1.setCarro(null);
	repository.save(c1);
	System.out.println("Adicionado " + c1.getNome());
	Motorista c2 = new Motorista();
	c2.setNome("Murillo");
	c2.setCarro(null);
	repository.save(c2);
	System.out.println("Adicionado " + c2.getNome());
    }

    @RequestMapping("/motorista/remover")
    public void remover() {
	System.out.println("Removeu " + monstrarTodos());
	repository.deleteAll();
    }
}