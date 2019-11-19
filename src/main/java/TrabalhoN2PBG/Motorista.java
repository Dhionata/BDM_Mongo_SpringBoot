package TrabalhoN2PBG;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class Motorista {
    @Id
    private String id;
    private String nome;

    private Carro carro;

}
