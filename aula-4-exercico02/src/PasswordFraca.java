public class PasswordFraca extends Senha {

    private static final String REGEX  = "^(?=.*[0-9])(?=.*[a-z]).{6,10}";

    public PasswordFraca() {
        super(REGEX);
        //TODO Auto-generated constructor stub
    }
    
}
