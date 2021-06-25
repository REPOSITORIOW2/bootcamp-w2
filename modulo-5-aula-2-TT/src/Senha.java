public class Senha {
    private String regex;

    public Senha(String regex) {
        this.regex = regex;
    }

    public void setValue(String pwd) {
        if(!pwd.matches(this.regex))
            throw new IllegalArgumentException("Formato da senha inválido!");

        System.out.println("Formato correto! Senha: " + pwd);
    }
}
