package br.com.meli.aula2spring.idade;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Period;

@RestController
public class IdadeController {

    @GetMapping("/{dia}/{mes}/{ano}")
    public int idade(@PathVariable int dia, @PathVariable int mes, @PathVariable int ano){
        LocalDate nascimento = LocalDate.of(ano, mes, dia);
        return Period.between(nascimento, LocalDate.now()).getYears();
    }
}
