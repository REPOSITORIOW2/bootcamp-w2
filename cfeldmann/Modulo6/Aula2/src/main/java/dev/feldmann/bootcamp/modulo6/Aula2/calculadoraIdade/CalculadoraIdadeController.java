package dev.feldmann.bootcamp.modulo6.Aula2.calculadoraIdade;

import org.hibernate.validator.constraints.Range;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import javax.validation.constraints.Min;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@RestController
@RequestMapping("/idade")
@Validated
public class CalculadoraIdadeController {


    @GetMapping("/{day}/{month}/{year}")
    public ResponseEntity<IdadeDTO> calculateIdade(
            @Min(1) @PathVariable Integer day,
            @Min(1) @PathVariable Integer month,
            @PathVariable Integer year) {

        try {
            var date = LocalDate.of(year, month, day);
            var now = LocalDate.now();

            if (date.isAfter(now)) {
                throw new IllegalArgumentException("Date is in the future!");
            }
            long idade = ChronoUnit.YEARS.between(date, now);
            return ResponseEntity.ok(IdadeDTO.fromIdade(idade));

        } catch (DateTimeException | IllegalArgumentException ex) {
            return ResponseEntity.badRequest().body(IdadeDTO.fromError(ex));
        }
    }
}


