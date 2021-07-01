package meli.bootcamp.spring.metrosquadrados.domain;

public class Comodo {
    private String nome;
    private double largura;
    private double comprimento;

    public Comodo(String nome, double largura, double comprimento) {
        this.nome = nome;
        this.largura = largura;
        this.comprimento = comprimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double area(){
        return this.largura * this.comprimento;
    }

    @Override
    public String toString() {
        return '{' +
                "nome:'" + this.getNome() + '\'' +
                "area:'" + this.area() + '\'' +
                '}';
    }
}
