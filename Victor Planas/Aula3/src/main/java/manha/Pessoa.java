package manha;

public class Pessoa implements Precedente<Pessoa>{
    private String nome;
    private int cpf;

    Pessoa(String nome, int cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int precedeA(Pessoa pessoa) {
        if(this.cpf > pessoa.getCpf()) return 1;
        if(this.cpf == pessoa.getCpf()) return 0;
        return -1;
    }

    @Override
    public String toString() {
        return "manha.Pessoa{" +
                "nome='" + nome + '\'' +
                ", cpf=" + cpf +
                '}';
    }
}

