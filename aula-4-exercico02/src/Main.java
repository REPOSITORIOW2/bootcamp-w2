public class Main {
 
    public static void main(String[] args) {
        String senhaValidaFraca = "123abcd";
        String senhaInvalidaFraca = "abc";
        Senha senhaFraca = new PasswordFraca();

        String senhaValidaMedia = "123ABCdef";
        String senhaInvalidaMedia = "123abcdef";
        Senha senhaMedia = new PasswordMedia();

        String senhaValidaForte = "123ABCdef@";
        String senhaInvalidaForte = "123abcdef";
        Senha senhaForte = new PasswordForte();

        try{
            //senhaFraca.setValue(senhaValidaFraca);
            //senhaMedia.setValue(senhaInvalidaMedia);
            senhaForte.setValue(senhaValidaForte);
        } catch (Exception e) {
            System.out.println("Senha invalida!");
            System.out.println(e.getMessage());
        }

    }
}
