public class PasswordForte extends Senha  {

    private static final String REGEX = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,32}$";

    public PasswordForte() {
        super(REGEX);
    }
    
}
