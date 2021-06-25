package Exercise1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Password {
    protected Pattern pattern;
    protected String password;

    public Password(String regex) {
        this.pattern = Pattern.compile(regex);
    }

    public void setValue (String pwd) {
        Matcher matcher = this.pattern.matcher(pwd);
        if(matcher.matches()) {
            this.password = pwd;
        } else {
            throw new PasswordStrengthMismatchException("Exercise1.Password not strong enough.");
        }
    }
}
