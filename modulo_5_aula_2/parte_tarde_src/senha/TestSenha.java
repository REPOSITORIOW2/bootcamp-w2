package senha;

public class TestSenha {
    public static void main(String[] args) {
        String forte = "CD!12asd";
        String media = "aAa1";
        String fraca = "a1";


        try {
            PasswordForte testException = new PasswordForte();
            testException.setValue(forte);

        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            PasswordFraca testException = new PasswordFraca();
            testException.setValue(fraca);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            PasswordMedia testException = new PasswordMedia();
            testException.setValue(media);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            PasswordForte testException = new PasswordForte();
            testException.setValue(fraca);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
