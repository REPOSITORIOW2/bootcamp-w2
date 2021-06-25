public class Senha {
    
    private String regex;
    
    public Senha(String regex) {
        this.regex = regex;
    }

    public String getRegex() {
        return this.regex;
    }

    public void setValue(String pwd) throws Exception {

        if(!pwd.matches(regex)){
            throw new Exception(" Senha fora do padrão"); 
        }

    }

}


