package TrabalhoN2PBG;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CarroRepository extends MongoRepository<Carro, String> {
    public Carro findByNome(String nome);

    public List<Carro> findByMarca(Integer idade);
}
