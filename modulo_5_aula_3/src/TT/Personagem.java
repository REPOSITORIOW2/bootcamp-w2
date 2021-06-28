package TT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Personagem {

    String nome;
    String classe;
    int nivel;
    List<Arma> mochila;
    Arma slot;

    public Personagem(String nome, String classe, int nivel) {
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
        this.mochila = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Personagem{" +
                "nome='" + nome + '\'' +
                ", classe='" + classe + '\'' +
                ", nivel=" + nivel +
                ", slot=" + slot +
                '}';
    }

    public List<Arma> getMochila() {
        return this.mochila;
    }

    public void setMochila(List<Arma> mochila) {
        this.mochila = mochila;
    }

    public void insereNaMochila(Arma arma){
        if (this.slot == null) {
            this.slot = arma;
        }
        this.mochila.add(arma);
        Collections.sort(this.mochila);
    }

    public void trocaArma(int index){
        this.slot = mochila.get(index);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public Arma getSlot() {
        return slot;
    }

    public void setSlot(Arma slot) {
        this.slot = slot;
    }
}
