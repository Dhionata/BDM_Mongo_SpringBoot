package br.com.objetos;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface SolicitacaoRepository extends MongoRepository<Solicitacao, String> {
    public Solicitacao findByMotorista(String solicitacao);

    public List<Solicitacao> findByCliente(String cliente);
}
