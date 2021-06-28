package com.meli.aula02.tt.exercicio1;

public class PasswordFraca extends Senha{
    public PasswordFraca() {
        super("^(?=.*[a-z])(?=.*[0-9])(?=.{8,})");
    }
}
