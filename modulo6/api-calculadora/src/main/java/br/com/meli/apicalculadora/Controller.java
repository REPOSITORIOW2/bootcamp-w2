package br.com.meli.apicalculadora;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@RestController
public class Controller {

    @GetMapping("/calculadora/{dia}/{mes}/{ano}")
    public String calculaIdade(@PathVariable int dia ,@PathVariable int mes ,@PathVariable int ano ) {

        LocalDate nascimento =  LocalDate.of(ano,mes,dia);
        LocalDate dataAtual = LocalDate.now();

        long years = ChronoUnit.YEARS.between(nascimento, dataAtual);
        return String.valueOf(years);

    }


}
