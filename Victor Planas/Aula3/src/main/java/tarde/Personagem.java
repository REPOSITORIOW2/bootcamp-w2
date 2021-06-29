package tarde;

public class Personagem {
    private String nome;
    private String classe;
    private int nivel;
    private Arma slot;

    public Personagem(String nome, String classe, int nivel) {
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
    }

    public void trocaArma(Arma novaArma){
        this.slot = novaArma;
        System.out.println("Voce equipou: " + novaArma.getNome());
    }

    public Arma getSlot() {
        return slot;
    }
}
