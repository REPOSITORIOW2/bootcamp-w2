package br.com.meli.roman.services;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class RomanService implements ConvertNumber{

    @Override
    public Map<String, String> convert(int number) {
        int initialNumber = number;
        Map<String, String> retorno = new HashMap<>();
        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] romanLiterals = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        StringBuilder roman = new StringBuilder();

        for(int i=0;i<values.length;i++) {
            while(number >= values[i]) {
                number -= values[i];
                roman.append(romanLiterals[i]);
            }
        }
        retorno.put(Integer.toString(initialNumber), roman.toString());
        return retorno;
    }
}
