package dev.feldmann.bootcamp.modulo6.Aula1.controllers;


import dev.feldmann.bootcamp.modulo6.Aula1.services.romanNumbersConverter.IRomanNumberConverterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RomanConverterController {

    @Autowired
    private IRomanNumberConverterService romanNumberConverterService;


    @GetMapping("/convertToRoman")
    public String convertNumber(@RequestParam Integer value) {
        return romanNumberConverterService.convertToRomanNumber(value);
    }


}
