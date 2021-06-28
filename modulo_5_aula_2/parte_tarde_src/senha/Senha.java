package senha;/*
Crie uma classe de senha. O construtor deve receber uma regex (expressão regular)
que valida o formato exigido para a senha.
Pesquise na Internet quais recursos Java fornece para operar com expressões regulares.

/^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[$*&@#])[0-9a-zA-Z$*&@#]{8,}$/
Explicando:
/^
  (?=.*\d)              // deve conter ao menos um dígito
  (?=.*[a-z])           // deve conter ao menos uma letra minúscula
  (?=.*[A-Z])           // deve conter ao menos uma letra maiúscula
  (?=.*[$*&@#])         // deve conter ao menos um caractere especial
  [0-9a-zA-Z$*&@#]{8,}  // deve conter ao menos 8 dos caracteres mencionados
$/
 */

public class Senha {

    private String pwd;
    private String regex;

    public Senha (String regex){
        this.regex = regex;
    }

    public String getPassword(){
        return this.pwd;
    }
    public void setValue (String pwd) throws Exception {
        if (!pwd.matches(regex)){
            throw new Exception("A senha nao obedece o padrao");
        }
        this.pwd = pwd;
        System.out.println("senha.Senha valida!");
    }

    public String getRegex(){
        return this.regex;
    }
    public void setRegex(String regex){
        this.regex = regex;
    }
}
