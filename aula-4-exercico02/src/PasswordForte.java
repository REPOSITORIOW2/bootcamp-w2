public class PasswordForte extends Senha  {

    private static final String REGEX = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[*.!@$%^&(){}[]:;<>,.?/~_+-=|\\]).{6,32}$"; 

    public PasswordForte() {
        super(REGEX);
        //TODO Auto-generated constructor stub
    }
    
}
