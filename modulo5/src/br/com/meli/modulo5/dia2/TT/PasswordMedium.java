package br.com.meli.modulo5.dia2.TT;

public class PasswordMedium extends Password{



    public PasswordMedium(String password) {

        super("(?=.*[A-Z])(?=.*[0-9])(?=.*[a-z]).{8}",password);

    }

    public PasswordMedium() {
        super("(?=.*[A-Z])(?=.*[0-9])(?=.*[a-z]).{8}");
    }

    public static void main(String[] args) {
        new PasswordMedium().setValue("asd");
        System.out.println("passou");
    }

}
