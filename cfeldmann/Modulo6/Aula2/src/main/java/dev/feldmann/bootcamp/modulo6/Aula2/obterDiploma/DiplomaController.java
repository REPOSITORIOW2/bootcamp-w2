package dev.feldmann.bootcamp.modulo6.Aula2.obterDiploma;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/diploma")
public class DiplomaController {

    @PostMapping
    public DiplomaDTO diploma(@Valid @RequestBody AlunoForm alunoForm) {
        double avg = alunoForm.getAverageGrade();
        String msg;
        if (avg >= 9) {
            msg = "Parabéns você foi aprovado com um anota acima de 9!!!";
        } else if (avg >= 7) {
            msg = "Aprovado!";
        } else {
            msg = "Reprovado!";
        }
        return new DiplomaDTO(alunoForm.getNome(), avg >= 7, avg, msg);
    }
}
