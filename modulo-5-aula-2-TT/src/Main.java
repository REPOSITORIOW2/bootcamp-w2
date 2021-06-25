public class Main {
    public static void main(String[] args) {
        SenhaFraca senhaFraca = new SenhaFraca();
        SenhaMedia senhaMedia = new SenhaMedia();
        SenhaForte senhaForte = new SenhaForte();

        senhaFraca.setValue("abc");
        senhaMedia.setValue("abcdefg");
        senhaForte.setValue("abcdefghij");
    }
}
