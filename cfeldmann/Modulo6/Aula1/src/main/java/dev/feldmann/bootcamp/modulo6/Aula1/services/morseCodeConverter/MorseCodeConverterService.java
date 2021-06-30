package dev.feldmann.bootcamp.modulo6.Aula1.services.morseCodeConverter;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class MorseCodeConverterService {

    private Map<Character, String> translateMap;

    public MorseCodeConverterService() {
        this.translateMap = buildTranslateTable();
    }


    public String fromMorseCode(String morseCode) {

        return Arrays.stream(morseCode.split("   "))
                .map(word -> Arrays.stream(word.split(" "))
                        .map(this::translateMorseChar)
                        .collect(Collectors.joining())
                ).collect(Collectors.joining(" "));

    }

    private String translateMorseChar(String morseChar) {

        var character = this.translateMap.entrySet().stream()
                .filter(e -> e.getValue().equals(morseChar))
                .map(e -> e.getKey().toString())
                .findFirst();
        return character.orElseThrow(() -> new IllegalArgumentException("Unable to convert " + morseChar + " morse char!"));
    }


    private Map<Character, String> buildTranslateTable() {
        var morse = new HashMap<Character, String>();
        morse.put('a', ".-");
        morse.put('b', "-...");
        morse.put('c', "-.-");
        morse.put('d', "-..");
        morse.put('e', ".");
        morse.put('f', "..-.");
        morse.put('g', "--.");
        morse.put('h', "....");
        morse.put('i', "..");
        morse.put('j', ".---");
        morse.put('k', "-.");
        morse.put('l', ".-..");
        morse.put('m', "--");
        morse.put('n', "-.");
        morse.put('o', "---");
        morse.put('p', ".--.");
        morse.put('q', "--.-");
        morse.put('r', ".-.");
        morse.put('s', "...");
        morse.put('t', "-");
        morse.put('u', "..-");
        morse.put('v', "...-");
        morse.put('w', ".--");
        morse.put('x', "-..-");
        morse.put('y', "-.--");
        morse.put('z', "--..");
        morse.put('1', ".----");
        morse.put('2', "..---");
        morse.put('3', "...--");
        morse.put('4', "....-");
        morse.put('5', ".....");
        morse.put('6', "-....");
        morse.put('7', "--...");
        morse.put('8', "---..");
        morse.put('9', "----.");
        morse.put('0', "-----");
        return morse;
    }

}
