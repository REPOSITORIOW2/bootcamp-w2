package br.com.mercadolivre.romanos;

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RomanosController {

    @GetMapping("/{nbr}")
    public String numeroRomano(@PathVariable String nbr) {
        String roman = NumeroRomano.convertDecimal(Integer.parseInt(nbr));
        System.out.println(roman);
        return "{'number':"+nbr+", 'roman': '"+roman+"'}"; // return NumeroRomano.convertDecimal(nbr);
    }
}
