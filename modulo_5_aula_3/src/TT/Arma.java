package TT;

public abstract class Arma implements Comparable<Arma>{
    protected double dano;
    protected double distancia;
    protected String nome;

    public Arma(){}

    public Arma(String nome, double dano, double distancia){
        this.nome = nome;
        this.dano = dano;
        this.distancia = distancia;
    }

    public abstract void atacar();

    @Override
    public String toString() {
        return this.nome;
    }

    @Override
    public int compareTo(Arma o) {
        return this.toString().compareTo(o.toString());
    }
}
