package com.meli.aula02.tt;

public class PasswordForte extends Senha{
    public PasswordForte() {
        super("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$");
    }
}




