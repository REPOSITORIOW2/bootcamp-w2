package JavaAula2.contas;

public abstract class Senha {

    String regEx;

    public Senha(String regEx) {
        this.regEx = regEx;
    }
    
    public void setValue(String pwd) {
        if (pwd.matches(regEx)) {
            System.out.println("deu tudo certo");
        } else {
            throw new SecurityException();
        }
    }
    
}
