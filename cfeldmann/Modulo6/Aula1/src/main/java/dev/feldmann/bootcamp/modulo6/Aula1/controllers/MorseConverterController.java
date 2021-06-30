package dev.feldmann.bootcamp.modulo6.Aula1.controllers;

import dev.feldmann.bootcamp.modulo6.Aula1.services.morseCodeConverter.MorseCodeConverterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MorseConverterController {


    @Autowired
    private MorseCodeConverterService converterService;


    @GetMapping("/morseCode")
    public String convertMorse(@RequestParam String morseCode) {
        return converterService.fromMorseCode(morseCode);
    }
}
