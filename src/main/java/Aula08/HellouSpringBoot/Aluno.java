package Aula08.HellouSpringBoot;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class Aluno {
    @Id
    public String id;
    private String nome;
    private Integer idade;
}
