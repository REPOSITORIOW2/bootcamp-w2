package br.com.meli.calcidade.calcidade;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/{p1}/{p2}/{p3}")
    public String endPoint3(@PathVariable("p1") int dia, @PathVariable("p2") int mes, @PathVariable("p3") int ano) {
        int x = 2020 - ano;
        return String.valueOf(x);
    }

}
