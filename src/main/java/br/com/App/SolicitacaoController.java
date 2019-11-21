package br.com.App;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SolicitacaoController {
    // AutoWired necessário em TODOS os repositórios
    @Autowired
    private SolicitacaoRepository repository;
    private Solicitacao s1 = new Solicitacao();
    private Solicitacao s2 = new Solicitacao();

    @RequestMapping("/solicitacao")
    public List<Solicitacao> monstrarTodos() {
	System.out.println("mostrou [Solicitações]" + repository.findAll());
	List<Solicitacao> Solicitacao = repository.findAll();
	return Solicitacao;
    }

    @RequestMapping("/solicitacao/adicionar")
    public void adicionar() {
	s1.setCliente(null);
	s1.setMotorista(null);
	s1.setValor(0);
	repository.save(s1);
	System.out.println("Adicionado [Solicitações]" + s1.getId());
	s2.setCliente(null);
	s2.setMotorista(null);
	s2.setValor(0);

	System.out.println("Adicionado [Solicitações]" + s2.getId());
    }

    @RequestMapping("/solicitacao/remover")
    public void remover() {
	System.out.println("Removeu [Solicitações]" + monstrarTodos());
	repository.deleteAll();
    }
}