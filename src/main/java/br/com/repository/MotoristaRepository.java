package br.com.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.objetos.Motorista;

@Repository
public interface MotoristaRepository extends MongoRepository<Motorista, String> {
    public Motorista findByNome(String nome);

    public List<Motorista> findByCarro(String carro);
}
