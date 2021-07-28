package tarde;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Senha {
    private String senha;
    private Pattern regex;

    Senha(String regex) {
        Pattern r = Pattern.compile(regex);
        this.regex = r;
    }

    public void setValue(String pwd) {
        try {
            Matcher matcher = regex.matcher(pwd);
            System.out.println(matcher.matches());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
