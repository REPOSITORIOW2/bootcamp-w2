package com.bootcamp.aula7exromanos;

import java.util.HashMap;

public class CodigoMorse {
    static Character alfabeto [] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', ' '};
     static String codigoMorse [] = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", "|"};
    static HashMap<String, Character> dicionarioMorse = new HashMap<String, Character>();
    static{
        for(int i = 0; i < alfabeto.length; i++)
        {
            dicionarioMorse.put( codigoMorse[i],alfabeto[i]);
        };
        dicionarioMorse.put(".----",'1');
        dicionarioMorse.put("..---",'2');
        dicionarioMorse.put( "...--",'3');
        dicionarioMorse.put("....-",'4');
        dicionarioMorse.put( ".....",'5');
        dicionarioMorse.put("-....",'6');
        dicionarioMorse.put( "--...",'7');
        dicionarioMorse.put("---..",'8');
        dicionarioMorse.put( "----.",'9');
        dicionarioMorse.put( "-----",'0');
        dicionarioMorse.put( "-----",'0');
        dicionarioMorse.put("",' ');
        dicionarioMorse.put(" ",' ');
    }
    public final static String traduzirMorse(String morse) {
        String[] array = morse.split(" ");
        String traducao = "";
        for(int i= 0; i< array.length; i++){
            traducao+= dicionarioMorse.get(array[i]);
        }
        return traducao;
    }

}
