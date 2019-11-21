package br.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.App.ClienteRepository;
import br.com.App.MotoristaRepository;
import br.com.App.SolicitacaoRepository;
import br.com.objetos.Solicitacao;

@RestController
public class SolicitacaoController {
    // AutoWired necessário em TODOS os repositórios
    @Autowired
    private SolicitacaoRepository Srepository;
    @Autowired
    private ClienteRepository Crepository;
    @Autowired
    private MotoristaRepository Mrepository;
    @Autowired
    private MotoristaController Mc = new MotoristaController();
    @Autowired
    private ClienteController Clic = new ClienteController();
    private Solicitacao s1 = new Solicitacao();
    private Solicitacao s2 = new Solicitacao();

    @RequestMapping("/solicitacao")
    public List<Solicitacao> monstrarTodos() {
	System.out.println("mostrou [Solicitações]\n" + Srepository.findAll());
	List<Solicitacao> Solicitacao = Srepository.findAll();
	return Solicitacao;
    }

    @RequestMapping("/solicitacao/adicionar")
    public void adicionar() {
	Mc.remover();
	System.out.println("Motoristas Excluídos para não duplicação!\n");
	Clic.remover();
	System.out.println("Clientes Excluídos para não duplicação\n");
	Mc.adicionar();
	System.out.println("Criado motorista Controller\n");
	Clic.adicionar();
	System.out.println("Criado o cliente Controller\n");
	s1.setCliente(Crepository.findByNome("Marcos"));
	s1.setMotorista(Mrepository.findByNome("Allan"));
	s1.setValor(300);
	Srepository.save(s1);
	System.out.println("Adicionado [Solicitação]\n" + s1);
	s2.setCliente(null);
	s2.setMotorista(null);
	s2.setValor(0);

	System.out.println("Adicionado [Solicitação]\n" + s2);
    }

    @RequestMapping("/solicitacao/remover")
    public void remover() {
	System.out.println("Removeu [Solicitações]\n" + monstrarTodos());
	Srepository.deleteAll();
    }
}