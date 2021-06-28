package aula5.tt;

import java.util.Comparator;
import java.util.List;

public class Personagem {
    private String nome;
    private Classes classe;
    private Integer nivel;
    private List<Arma> armasDisponiveis;
    private Arma arma;
    private Integer vida;

    public Personagem(String nome, Classes classe, Integer nivel, List<Arma> armasDisponiveis,Arma arma) {
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
        this.armasDisponiveis = armasDisponiveis;
        this.arma = arma;
        this.vida = 100;

        ordenarArmas(this.armasDisponiveis);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Classes getClasse() {
        return classe;
    }

    public void setClasse(Classes classe) {
        this.classe = classe;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public Arma getArma() {
        return arma;
    }

    public List<Arma> getArmasDisponiveis() {
        return armasDisponiveis;
    }

    public void setArmasDisponiveis(List<Arma> armasDisponiveis) {
        this.armasDisponiveis = armasDisponiveis;
    }

    public Integer getVida() {
        return vida;
    }

    public void setVida(Integer vida) {
        this.vida = vida;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }
    
    private void ordenarArmas(List<Arma> armas) {
        armas.sort(new Comparator<Arma>() {
            @Override
            public int compare(Arma o1, Arma o2) {
                return o1.compareTo(o2);
            }
        });
    }

    public void usarArma(Personagem p) {
        this.arma.atacar(p);
    }

    @Override
    public String toString() {
        return "Personagem{" +
                "nome='" + nome + '\'' +
                ", classe=" + classe +
                ", nivel=" + nivel +
                ", arma=" + arma +
                ", vida=" + vida +
                '}';
    }
}
