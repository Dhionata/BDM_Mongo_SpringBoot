package TrabalhoN2PBG;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CarroRepository extends MongoRepository<Carro, String> {
    public Carro findByModelo(String modelo);

    public List<Carro> findByMarca(String marca);
}
