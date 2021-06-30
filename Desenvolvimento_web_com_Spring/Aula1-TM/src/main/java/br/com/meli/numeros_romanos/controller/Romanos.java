package br.com.meli.numeros_romanos.controller;

import org.springframework.web.bind.annotation.*;

import static java.util.Collections.nCopies;
import static java.lang.String.join;

@RestController
public class Romanos {

    private static final int[] DECIMAIS =
            {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private static final String[] ROMANOS =
            {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    @GetMapping(path = "/{numero}")
    // @RequestMapping(method = RequestMethod.GET, path = "/{numero}")
    public String numeroRomanos(@PathVariable("numero") int decimal ){
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < DECIMAIS.length; i++) {
            int parteInteira = decimal / DECIMAIS[i];
            decimal -= DECIMAIS[i] * parteInteira;
            resultado.append(join("", nCopies(parteInteira, ROMANOS[i])));
        }
        return resultado.toString();
    }
}
