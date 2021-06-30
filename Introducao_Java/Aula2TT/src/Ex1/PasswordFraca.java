package Ex1;

public class PasswordFraca extends Password {

	public PasswordFraca() {
		super("^(?=.*[0-9])((?=.*[a-z])|(?=.*[A-Z])).{1,20}$" ,"Sua senha deve ter pelo menos um digito ou caracter");
		// TODO Auto-generated constructor stub
	}
	
}
