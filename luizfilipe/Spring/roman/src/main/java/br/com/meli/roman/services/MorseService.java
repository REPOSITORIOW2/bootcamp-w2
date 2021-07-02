package br.com.meli.roman.services;

import br.com.meli.roman.Utils.MorseCode;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class MorseService {

    public Map<String, String> convertToMorse (String morse) {
        String actual = "";
        String code = "";
        char space = ' ';
        int counterSpace = 0;
        morse.toUpperCase();
        Map<String, String> retorno = new HashMap<>();

        for (int i = 0; i<morse.length(); i++){
            if (Character.compare(morse.charAt(i), space) == 0){
                counterSpace += 1;
                if(counterSpace != 3 && code.length() != 0){
                    actual += MorseCode.decode(code);
                }
                code = "";
            } else {
                code += morse.charAt(i);
            }
            if (counterSpace == 3) {
                actual += " ";
                counterSpace = 0;
            }
        }

        actual += MorseCode.decode(code);

        retorno.put("retorno", actual);
        return retorno;
    }


}
