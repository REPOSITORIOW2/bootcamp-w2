public class PasswordMedia extends Senha  {

    private static final String REGEX  = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{6,18}$";

    public PasswordMedia() {
        super(REGEX);
        //TODO Auto-generated constructor stub
    }
    
}
