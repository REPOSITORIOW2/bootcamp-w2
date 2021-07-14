package br.com.meli.aula2spring.diploma.dtos;

import br.com.meli.aula2spring.diploma.entities.Aluno;
import br.com.meli.aula2spring.diploma.entities.Subject;

import java.util.List;

public class StudentDTO extends Aluno {
    public StudentDTO(String nome, List<Subject> subjects) {
        super(nome, subjects);
    }

    public static StudentDTO convertToDTO(Aluno aluno){
        return new StudentDTO(aluno.getName(), aluno.getSubjects());
    }
}
