package aula4;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ex3_1 {
    public static void main(String[] args) {

        Password passwordForte = new PasswordForte();
        Password passwordMedio = new PasswordMedia();
        Password passwordFraco = new PasswordFraca();

        passwordForte.setValue("1Aa@abcd");
        passwordMedio.setValue("1Aaabcde");
        passwordFraco.setValue("abcdefgh");
    }

    public abstract static class Password{

        private String pattern;

        public Password(){
        }

        public Password(String pattern) {
            this.pattern = pattern;
        }

        public abstract void setValue (String pwd);
    }

    public static class PasswordForte extends Password{

        private String pattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=;])(?=\\S+$).{8,}";

        @Override
        public void setValue(String pwd) {
            Pattern r = Pattern.compile(pattern);
            Matcher m = r.matcher(pwd);
            if (m.find())
                System.out.println("Senha alterada com sucesso!");
            else
                throw new PasswordInvalidException("A senha precisa conter pelo menos 8 caracteres, uma letra maiúscula," +
                        "uma minúscula, um caractere especial entre as opções @#$%^&+=;, um número e não pode conter espaços.");
        }
    }

    public static class PasswordMedia extends Password{

        private String pattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=\\S+$).{8,}";

        @Override
        public void setValue(String pwd) {
            Pattern r = Pattern.compile(pattern);
            Matcher m = r.matcher(pwd);
            if (m.find())
                System.out.println("Senha alterada com sucesso!");
            else
                throw new PasswordInvalidException("A senha precisa conter pelo menos 8 caracteres, uma letra maiúscula," +
                        "uma minúscula, um número e não pode conter espaços.");
        }
    }

    public static class PasswordFraca extends Password{

        private String pattern = "(?=.*[a-z])(?=\\S+$).{8,}";

        @Override
        public void setValue(String pwd) {
            Pattern r = Pattern.compile(pattern);
            Matcher m = r.matcher(pwd);
            if (m.find())
                System.out.println("Senha alterada com sucesso!");
            else
                throw new PasswordInvalidException("A senha precisa conter pelo menos 8 caracteres e não pode conter espaços.");
        }
    }

    public static class PasswordInvalidException extends RuntimeException{
        public PasswordInvalidException(String message) {
            super(message);
        }
    }
}
