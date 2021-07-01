package meli.bootcamp.spring.idade.controller;

import meli.bootcamp.spring.idade.model.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IdadeController {

    private static final String INVALID_DATE_ERR = "A data passada não é válida.";
    private static final String FUTURE_DATE_ERR = "A data está no futuro";
    @GetMapping("{day}/{month}/{year}")
    public ResponseEntity<String> idade(@PathVariable int day, @PathVariable int month, @PathVariable int year) {
        Data data = new Data(day, month, year);
        int idade = data.idade();
        if (idade == Data.INVALID_DATE_ERR)
            return new ResponseEntity<>(INVALID_DATE_ERR, HttpStatus.UNPROCESSABLE_ENTITY);
        else if (idade == Data.FUTURE_DATE_ERR)
            return new ResponseEntity<>(FUTURE_DATE_ERR, HttpStatus.UNPROCESSABLE_ENTITY);
        return new ResponseEntity<>(String.valueOf(data.idade()), HttpStatus.OK);

    }
}
