package com.meli.aula02.tt;

public class PasswordFraca extends Senha{
    public PasswordFraca() {
        super("^(?=.*[a-z])(?=.*[0-9])(?=.{8,})");
    }
}
