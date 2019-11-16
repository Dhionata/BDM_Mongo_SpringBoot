package Aula08.HellouSpringBoot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlunoController {
    int i = 0;
    @Autowired
    private AlunoRepository repository;

    @RequestMapping("/aluno")
    public List<Aluno> monstrarTodos() {
	System.out.println("mostrou");
	List<Aluno> alunos = repository.findAll();
	return alunos;
    }

    @RequestMapping("/aluno/adicionar")
    public void adicionar() {
	Aluno a1 = new Aluno();
	a1.setNome("Dhionatã");
	a1.setIdade(19);
	repository.save(a1);
	System.out.println("Adicionado" + a1.getNome());
	Aluno a2 = new Aluno();
	a2.setNome("Bruna");
	a2.setIdade(23);
	repository.save(a2);
	System.out.println("Adicionado" + a2.getNome());
	i++;
	System.out.println("vezes: " + i);
    }

    @RequestMapping("/aluno/remover")
    public void remover() {
	System.out.println("Removeu");
	repository.deleteAll();
    }
}