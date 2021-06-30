package Ex1;

public class Principal {

	public static void main(String[] args) {
		Password password = new PasswordFraca();
		password.validaSenha("a123456");
		
		password = new PasswordMedia();
		password.validaSenha("Aa123456");
		
		password = new PasswordForte();
		password.validaSenha("Aa123456s*");
		
	}
	
}
