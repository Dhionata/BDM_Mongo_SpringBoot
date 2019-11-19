package br.com.objetos;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface MotoristaRepository extends MongoRepository<Motorista, String> {
    public Motorista findByNome(String nome);

    public List<Motorista> findByCarro(String carro);
}
