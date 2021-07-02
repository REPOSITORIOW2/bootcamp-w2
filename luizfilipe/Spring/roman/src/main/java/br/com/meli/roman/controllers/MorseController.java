package br.com.meli.roman.controllers;

import br.com.meli.roman.services.MorseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/morse")
public class MorseController {

    @Autowired
    MorseService morseConvert;

    @GetMapping("/convert/")
    public Map<String, String> convertTo(@RequestParam String morse) {
        System.out.println(morse);
        return morseConvert.convertToMorse(morse);
    }
}
