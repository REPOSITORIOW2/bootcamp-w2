package aula5.tt;

public abstract class Arma implements Comparable<Arma> {
    private String nome;
    private Integer dano;

    public Arma(String nome, Integer dano) {
        this.nome = nome;
        this.dano = dano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getDano() {
        return dano;
    }

    public void setDano(Integer dano) {
        this.dano = dano;
    }

    public abstract void atacar(Personagem p);

    @Override
    public int compareTo(Arma o) {
        return this.nome.compareToIgnoreCase(o.nome);
    }

    @Override
    public String toString() {
        return "Arma{" +
                "nome='" + nome + '\'' +
                ", dano=" + dano +
                '}';
    }
}
