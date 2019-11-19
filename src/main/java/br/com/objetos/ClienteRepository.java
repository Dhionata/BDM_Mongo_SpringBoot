package br.com.objetos;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClienteRepository extends MongoRepository<Cliente, String> {
    public Cliente findByNome(String nome);

    public List<Cliente> findByTelefone(String telefone);
}
