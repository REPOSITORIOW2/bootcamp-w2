package com.meli.aula02.tt;

public class PasswordMedia extends Senha{
    public PasswordMedia() {
        super("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.{8,})");
    }
}
