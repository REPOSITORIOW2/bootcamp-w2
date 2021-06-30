package com.bootcamp.aula7exromanos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/converter")
public class ConversorController {

    @GetMapping("/romano")
    public String converterRomano(@RequestParam(value = "numero", defaultValue = "1") Integer numero) {
        return String.format(NumeroRomano.converterParaRomano(numero));
    }

    @GetMapping("/morse")
    public String sayHello(@RequestParam(value = "codigoMorse", defaultValue = "1") String codigoMorse) {
        return String.format(CodigoMorse.traduzirMorse(codigoMorse));
    }
}
