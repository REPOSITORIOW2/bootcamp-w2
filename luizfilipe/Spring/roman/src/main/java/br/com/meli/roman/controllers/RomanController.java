package br.com.meli.roman.controllers;

import br.com.meli.roman.services.RomanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/roman")
public class RomanController {

    @Autowired
    private RomanService roman;

    @GetMapping("/convert/{number}")
    public Map<String, String> convertTo(@PathVariable String number) {
        return roman.convert(Integer.valueOf(number));
    }
}
