package br.com.meli.apiromanos;

import com.github.chaosfirebolt.converter.RomanInteger;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @GetMapping("/convert/{value}")
    public String endPoint(@PathVariable String value) {
        RomanInteger validArabicParse = RomanInteger.parse(value);
        return "O valor convertido é:" +validArabicParse.toString();
    }
}
