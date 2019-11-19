package TrabalhoN2PBG;

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
	Cliente c1 = new Cliente();
	c1.setNome("Marcos");
	c1.setTelefone("(62)99999-9999");
	c1.setLocal("Goiânia");
	repository.save(c1);
	System.out.println("Adicionado " + c1.getNome());
	Cliente c2 = new Cliente();
	c2.setNome("Murillo");
	c2.setTelefone("(62)98888-8888");
	c2.setLocal("Edeia");
	repository.save(c2);
	System.out.println("Adicionado " + c2.getNome());
    }

    @RequestMapping("/cliente/remover")
    public void remover() {
	System.out.println("Removeu " + monstrarTodos());
	repository.deleteAll();
    }
}