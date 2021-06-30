package Ex1;

public class PasswordForte extends Password {

	public PasswordForte() {
		super("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$" ,"Sua senha deve ter pelo menos um digito, um caracter especial, uma letra minuscula, uma letra maiusculo e no minimo 8 caracteres");
		// TODO Auto-generated constructor stub
	}
	
}
