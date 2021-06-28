package com.meli.aula02.tt.exercicio1;

public class PasswordForte extends Senha{
    public PasswordForte() {
        super("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$");
    }
}




