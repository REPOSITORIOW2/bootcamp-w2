package com.bootcampmeli.codigomorse.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class CodigoMorseService {
    
    private Map<String, Character> morseCodes;

    public CodigoMorseService() {
        char[] alphabet = new char[] {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', ' ', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
        String[] morseCodeStrings = new String[] {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", "|", ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "-----"};
        
        morseCodes = new HashMap<String, Character>();
        for(int i = 0; i < alphabet.length; i++)
            morseCodes.put(morseCodeStrings[i], alphabet[i]);
    }

    public String translate(String phrase) {
        phrase = phrase.replaceAll("   ", " | ");

        String[] morseWords = phrase.split(" ");
        StringBuilder translatedWord = new StringBuilder();

        for(String morseWord : morseWords) {
            translatedWord.append(morseCodes.get(morseWord));
        }
        return translatedWord.toString();
    }
}
