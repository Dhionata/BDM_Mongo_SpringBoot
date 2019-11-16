package Aula08.HellouSpringBoot;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface AlunoRepository extends MongoRepository<Aluno, String> {
    public Aluno findByNome(String nome);

    public List<Aluno> findByIdade(Integer idade);
}
