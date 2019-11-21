package br.com.App;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.objetos.Cliente;

@Repository
public interface ClienteRepository extends MongoRepository<Cliente, String> {
    public Cliente findByNome(String nome);

    public List<Cliente> findByLocal(String local);
}
