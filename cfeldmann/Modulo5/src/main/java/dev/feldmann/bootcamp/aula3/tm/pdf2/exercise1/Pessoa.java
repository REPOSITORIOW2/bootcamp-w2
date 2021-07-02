package dev.feldmann.bootcamp.aula3.tm.pdf2.exercise1;

public class Pessoa implements Precedente<Pessoa>{
    private String nome;
    private String cpf;

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public int precedeA(Pessoa pessoa) {
        return this.getNome().compareToIgnoreCase(pessoa.getNome());
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
