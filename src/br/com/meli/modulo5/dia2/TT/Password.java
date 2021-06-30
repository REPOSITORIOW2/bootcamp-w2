package br.com.meli.modulo5.dia2.TT;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {

    protected String password;
    protected String regex;

    public Password(String regex, String password) {

        Pattern p = Pattern.compile(regex);

        Matcher m = p.matcher(password);

        if(!m.matches()){
            throw new IllegalArgumentException();
        }

        this.password = password;
        this.regex = regex;

    }

    public Password(String regex) {
        this.regex = regex;
    }

    public Password() {
    }

    public void setValue (String pwd){

        Pattern p = Pattern.compile(regex);

        Matcher m = p.matcher(pwd);

        if(!m.matches()){
            throw new IllegalArgumentException();
        }

        this.password = pwd;

    }

}
