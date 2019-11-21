package br.com.App;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.objetos.Carro;

@Repository
public interface CarroRepository extends MongoRepository<Carro, String> {
    public Carro findByModelo(String modelo);

    public List<Carro> findByMarca(String marca);
}
