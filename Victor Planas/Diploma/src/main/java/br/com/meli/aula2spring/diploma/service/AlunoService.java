package br.com.meli.aula2spring.diploma.service;

import br.com.meli.aula2spring.diploma.dtos.DiplomaDTO;
import br.com.meli.aula2spring.diploma.dtos.StudentDTO;
import br.com.meli.aula2spring.diploma.entities.Aluno;
import br.com.meli.aula2spring.diploma.entities.Subject;
import br.com.meli.aula2spring.diploma.repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlunoService {
    AlunoRepository repository;

    @Autowired
    public AlunoService(AlunoRepository repository) {
        this.repository = repository;
    }

    public DiplomaDTO writeDiploma(Aluno aluno) {
        double average = calculateAverage(aluno);
        return new DiplomaDTO(withHonors(average) + "Sua média foi de " + average, average, StudentDTO.convertToDTO(aluno));
    }

    public double calculateAverage(Aluno aluno) {
        return aluno.getSubjects().stream()
                .mapToDouble(Subject::getNote)
                .average()
                .orElse(0);
    }

    public String withHonors(double average) {
        return average >= 9 ? "Parabéns!! " : "";
    }

    public DiplomaDTO addAluno(Aluno aluno) {
        repository.save(aluno);
        return writeDiploma(aluno);
    }
}
