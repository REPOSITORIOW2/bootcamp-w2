package br.com.meli.modulo5.dia3.TT.personagem;

import br.com.meli.modulo5.dia3.TT.arma.Arma;

public class Personagem {
    private String nome;
    private Classe classe;
    private int nivel = 1;
    private Arma arma;

    public Personagem(String nome, Classe classe, Arma arma) {
        this.nome = nome;
        this.classe = classe;
        this.arma = arma;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public void atacar() {
        System.out.printf("O personagem %s atacou com a arma %s e causou %.2f de dano.\n",
                this.nome, this.getArma().getNome(), this.getArma().calcularDano(this));

        subirNivel();
    }

    public void subirNivel() {
        this.nivel++;
        System.out.printf("O personagem %s subiu para o nível %s\n\n", this.nome, this.nivel);
    }
}