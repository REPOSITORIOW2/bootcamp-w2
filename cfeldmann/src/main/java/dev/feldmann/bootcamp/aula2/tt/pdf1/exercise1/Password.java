package dev.feldmann.bootcamp.aula2.tt.pdf1.exercise1;

import java.util.regex.Pattern;

public class Password {

    private Pattern regex;
    private String value = null;


    public Password(Pattern regex) {
        this.regex = regex;
    }

    public Password(String regex){
        this.regex = Pattern.compile(regex);
    }

    public void setValue(String value) throws InvalidPasswordFormat {
        if(!this.regex.matcher(value).find()){
            throw new InvalidPasswordFormat(regex);
        }
        this.value = value;
    }
}
