package br.com.meli.modulo5.dia2.TT;

public class PasswordWeak extends Password{



    public PasswordWeak(String password) {

        super("^{8}$",password);

    }

    public PasswordWeak() {
        super("^{8}$");
    }

    public static void main(String[] args) {
        new PasswordWeak().setValue("asd");
        System.out.println("passou");
    }

}
