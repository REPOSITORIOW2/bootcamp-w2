package com.melibootcamp;

public class Pessoa implements Precedente<Pessoa> {
    private String nome;
     private String cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public Pessoa() {
    }

    @Override
    public int precedeA(Pessoa pessoa) {
        if (this.nome.toLowerCase().compareTo(pessoa.nome.toLowerCase()) > 0)
            return 1;
        if (this.nome.toLowerCase().compareTo(pessoa.nome.toLowerCase()) < 0)
            return -1;
        else
            return 0;
    }

    @Override
    public String ToString() {
        return this.getNome() +" CPF: "+ this.getCpf();
    }
}
