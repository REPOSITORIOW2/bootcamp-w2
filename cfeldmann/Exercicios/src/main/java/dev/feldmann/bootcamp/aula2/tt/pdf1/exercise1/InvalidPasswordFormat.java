package dev.feldmann.bootcamp.aula2.tt.pdf1.exercise1;

import java.util.regex.Pattern;

public class InvalidPasswordFormat extends Exception{

    private Pattern pattern;

    public InvalidPasswordFormat(Pattern pattern) {
        super("Password is not in the proper format, all passwords should match "+pattern.pattern()+" RegEx");
        this.pattern = pattern;
    }
}
