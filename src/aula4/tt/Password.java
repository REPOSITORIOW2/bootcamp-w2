package aula4.tt;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {
    private Pattern pattern;
    private String value;

    public Password(Pattern p) throws Exception {
        if (p == null) {
            throw new Exception("Expressão regular não pode ser nula");
        }
        this.pattern = p;
    }

    public Password(String p) throws Exception {
        if (p == null) {
            throw new Exception("Expressão regular não pode ser nula");
        }
        this.pattern = Pattern.compile(p);
    }

    public void setValue(String p) throws Exception {
        Matcher m = this.pattern.matcher(p);
        if (!m.find()) {
            throw new Exception("Senha inválida");
        }
        this.value = p;
    }

    public String getValue() {
        return value;
    }

    public static void test(Password x) {
        String passwords[] = {
                "a",
                "ab",
                "abc",
                "abcd",
                "1",
                "12",
                "123",
                "1234",
                "a1",
                "ab12",
                "a1b2",
                "a1b2_",
                "a1b2_A",
                "a1b2AB",
                "abcABC",
                "abc2ABC",
        };

        for (String p : passwords) {
            try {
                x.setValue(p);
                System.out.printf("'%20s' é uma senha válida\n", p);
            } catch (Exception e) {
                System.out.printf("'%20s' NÃO é uma senha válida\n", p);
            }
        }
    }
}

