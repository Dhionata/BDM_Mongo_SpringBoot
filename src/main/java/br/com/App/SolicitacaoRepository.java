package br.com.App;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.objetos.Solicitacao;

@Repository
public interface SolicitacaoRepository extends MongoRepository<Solicitacao, String> {
    public Solicitacao findByMotorista(String solicitacao);

    public List<Solicitacao> findByCliente(String cliente);
}
