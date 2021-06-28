public class PasswordFraca extends Senha{
    public PasswordFraca() {
        // Senhas com no mínimo 5 números
        super("^(?=.*[0-9])(?=.*[a-z]).{2,128}$");
    }
}
