package br.com.meli.aula2spring.diploma;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/diploma")
public class DiplomaController {

    @PostMapping
    public String calculaMedia(@RequestBody Aluno aluno){
        return aluno.calculaMedia();
    }
}
