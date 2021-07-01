package br.com.mercadolivre.calculadoidade;

import org.apache.tomcat.jni.Local;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Period;

@RestController
public class CalculadoraIdadeController {

    @GetMapping("/{day}/{month}/{year}")
    public ResponseEntity<Integer> calculadoraIdade(@PathVariable int day, @PathVariable int month, @PathVariable int year) {
        LocalDate birthday = LocalDate.of(year, month, day);
        return new ResponseEntity<>(Period.between(birthday, LocalDate.now()).getYears(), HttpStatus.OK);
    }
}
