package br.com.meli.calculadoraidade.Controller;

import java.time.Period;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDate;

@RestController
public class CalculadoraIdade {

    @RequestMapping("/{dia}/{mes}/{ano}")
    public Integer calcIdade(@PathVariable Integer dia,@PathVariable Integer mes, @PathVariable Integer ano){

        LocalDate data = LocalDate.now() ;
        LocalDate dataAniversario = LocalDate.of(ano,mes,dia);
        Period periodo = Period.between(dataAniversario,data);

        return periodo.getYears();

    }

}
