package br.com.objetos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CarroRepository extends MongoRepository<Carro, String> {
    @Autowired
    public Carro findByModelo(String modelo);

    public List<Carro> findByMarca(String marca);
}
