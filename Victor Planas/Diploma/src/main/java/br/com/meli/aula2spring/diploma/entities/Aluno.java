package br.com.meli.aula2spring.diploma.entities;

import br.com.meli.aula2spring.diploma.interfaces.Idable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.List;

@Getter
@Setter
@Validated
public class Aluno implements Idable {
    @NotBlank(message = "Name cannot be blank")
    @Size(min = 8, max = 50)
    @Pattern(regexp = "[a-z]")
    private String name;
    @Valid
    private List<Subject> subjects;
    @JsonIgnore
    private Integer id;

    public Aluno(String nome, List<Subject> subjects) {
        this.name = nome;
        this.subjects = subjects;
    }

}
