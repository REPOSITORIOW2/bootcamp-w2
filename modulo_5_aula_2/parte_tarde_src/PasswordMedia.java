public class PasswordMedia extends Senha{

    public PasswordMedia(){
            super("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{4,128}$");
    }
}
