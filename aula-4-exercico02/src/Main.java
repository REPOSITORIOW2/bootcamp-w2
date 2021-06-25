public class Main {
 
    public static void main(String[] args) throws Exception {
        String senhaValida = "123abcd";
        String senhaInvalida = "abc";
        Senha senha = new PasswordFraca();

        senha.setValue(senhaInvalida);
    }
}
