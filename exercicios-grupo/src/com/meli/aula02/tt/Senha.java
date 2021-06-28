package com.meli.aula02.tt;

public class Senha {
    private String senha;
    private final String pattern;


    public Senha(String pattern) {
       this.pattern = pattern;
    }

    public void setSenha(String senha) {
        if(senha.matches(pattern)) {
            this.senha = senha;
        } else
            throw new SenhaException("Senha não atende requisitos");
    }

    public String getSenha() {
        return senha;
    }
}
