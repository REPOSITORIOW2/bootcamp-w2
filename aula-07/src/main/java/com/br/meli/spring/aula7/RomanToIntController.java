package com.br.meli.spring.aula7;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RomanToIntController {
    @GetMapping("/to-roman/{num}")
    public String intToRoman(@PathVariable int num) {
        Representacao rs = new Representacao(num);

        return rs.toRoman();

    }

    @GetMapping("/to-int/{roman}")
    public int romanToInt(@PathVariable String roman) {
        Representacao rs = new Representacao(roman);

        return rs.toInt();

    }
}
