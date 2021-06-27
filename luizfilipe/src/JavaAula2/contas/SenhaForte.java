package JavaAula2.contas;

public class SenhaForte extends Senha {

    public SenhaForte() {
        super("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$");
    }
    
}
