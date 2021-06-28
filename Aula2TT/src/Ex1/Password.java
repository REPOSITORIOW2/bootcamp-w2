package Ex1;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Password {

	private String regex;
	private String msgErro;
	
	public Password(String regex, String msgErro) {
		this.regex = regex;
		this.msgErro = msgErro;
	}
	
	public void validaSenha(String password) {
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(password);
        if(!matcher.matches()) {
        	throw new IllegalArgumentException(this.msgErro);
        }
        
	}
	
}
