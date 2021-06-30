package br.com.meli.aula1spring.manha;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumeroRomano {

    @GetMapping(path = "/transformaNumeroRomano/{numero}")
    public String numeroRomano(@PathVariable String numero){
        int num = Integer.valueOf(numero);
        System.out.println("Integer: " + num);
        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] romanLiterals = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        StringBuilder roman = new StringBuilder();

        for(int i=0;i<values.length;i++) {
            while(num >= values[i]) {
                num -= values[i];
                roman.append(romanLiterals[i]);
            }
        }
        return "Numero indo-arábico: " + numero + " | Numero romano: " + roman.toString();
    }
}
