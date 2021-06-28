package JavaAula2.contas;

public class SenhaFraca extends Senha {

    public SenhaFraca() {
        super("^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{4,}$");
    }
    
}
