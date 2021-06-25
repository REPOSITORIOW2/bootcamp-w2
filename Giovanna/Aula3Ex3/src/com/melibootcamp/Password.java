package com.melibootcamp;

import java.util.InvalidPropertiesFormatException;
import java.util.regex.Pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;


public class Password {

    private String password;
    private String pattern;

    public Password(String pattern) {
    this.pattern = pattern;
    }

    public Password() {
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public void setValue (String pwd){
        try{
             var patternCompiled = Pattern.compile(this.pattern);
            System.out.println();
            var matcher =
                    patternCompiled.matcher(pwd);
            if(!matcher.matches()){
                throw new InvalidPropertiesFormatException("");
            }
            this.password = pwd;
            System.out.println("Senha valida");
        }
        catch(Exception pse){
            System.out.println("Senha invalida");
        }
    }
}

