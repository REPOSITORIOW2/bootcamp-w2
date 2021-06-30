package br.com.meli.aula1spring.tarde;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

@RestController
public class CodigoMorse {
    @GetMapping(path = "/codigomorse/{codigo}")
    public String traduzCodigoMorse(@PathVariable String codigo) {
        HashMap<String, String> cods = new HashMap<String, String>();
        cods.put(".-", "A");
        cods.put("-...", "B");
        cods.put("-.-.", "C");
        cods.put("-..", "D");
        cods.put(".", "E");
        cods.put("..-.", "F");
        cods.put("--.", "G");
        cods.put("....", "H");
        cods.put("..", "I");
        cods.put(".---", "J");
        cods.put("-.-", "K");
        cods.put(".-..", "L");
        cods.put("--", "M");
        cods.put("-.", "N");
        cods.put("---", "O");
        cods.put(".--.", "P");
        cods.put("--.-", "Q");
        cods.put(".-.", "R");
        cods.put("...", "S");
        cods.put("-", "T");
        cods.put("..-", "U");
        cods.put("...-", "V");
        cods.put(".--", "W");
        cods.put("-..-", "X");
        cods.put("-.--", "Y");
        cods.put("--..", "Z");
        cods.put(".----", "1");
        cods.put("..---", "2");
        cods.put("...--", "3");
        cods.put("....-", "4");
        cods.put(".....", "5");
        cods.put("-....", "6");
        cods.put("--...", "7");
        cods.put("---..", "8");
        cods.put("----.", "9");
        cods.put("-----", "0");


        List<String> palavras = new ArrayList<>();
        List<String> letras = new ArrayList<>();
        String atual = codigo;
        String resposta = "";
        palavras = Arrays.asList(atual.split("   "));
        for (String palavra : palavras) {
            letras = Arrays.asList(palavra.split(" "));

            for (String letra : letras) {
                resposta += cods.get(letra);
            }
            resposta += " ";
        }
        System.out.println(resposta);
        return resposta;
    }
}
