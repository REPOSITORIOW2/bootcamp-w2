package aula4.tt;

import java.util.regex.Pattern;

public class WeakPassword extends Password {
    public WeakPassword() throws Exception {
        super("^[a-z0-9]{3,}$");
    }

    public static void main(String[] args) throws Exception {
        Password.test(new WeakPassword());
    }
}