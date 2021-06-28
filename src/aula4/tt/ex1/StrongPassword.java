package aula4.tt.ex1;

public class StrongPassword extends Password {
    public StrongPassword() throws Exception {
        super("([a-z]+[0-9]+[A-Z]+)+");
    }

    public static void main(String[] args) throws Exception {
        Password.test(new StrongPassword());
    }
}
