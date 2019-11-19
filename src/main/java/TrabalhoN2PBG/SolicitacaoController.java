package TrabalhoN2PBG;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SolicitacaoController {
    @Autowired
    private SolicitacaoRepository repository;

    @RequestMapping("/solicitacao")
    public List<Solicitacao> monstrarTodos() {
	System.out.println("mostrou [Solicitações]" + repository.findAll());
	List<Solicitacao> Solicitacao = repository.findAll();
	return Solicitacao;
    }

    @RequestMapping("/solicitacao/adicionar")
    public void adicionar() {
	Solicitacao c1 = new Solicitacao();
	c1.setCliente(null);
	c1.setMotorista(null);
	c1.setValor(0);
	repository.save(c1);
	System.out.println("Adicionado [Solicitações]" + c1.getId());
	Solicitacao c2 = new Solicitacao();
	c2.setCliente(null);
	c2.setMotorista(null);
	c2.setValor(0);

	System.out.println("Adicionado [Solicitações]" + c2.getId());
    }

    @RequestMapping("/solicitacao/remover")
    public void remover() {
	System.out.println("Removeu [Solicitações]" + monstrarTodos());
	repository.deleteAll();
    }
}