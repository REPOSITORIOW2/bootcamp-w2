package aula4.tt.ex1;

public class MediumPassword extends Password {
    public MediumPassword() throws Exception {
        super("[a-zA-Z0-9]{6,}");
    }

    public static void main(String[] args) throws Exception {
        Password.test(new MediumPassword());
    }
}
