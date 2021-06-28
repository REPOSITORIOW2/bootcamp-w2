package tarde;

public class Arma {
    private String nome;
    private String tipoAtaque;
    private int dano;

    Arma(String nome, String tipoAtaque, int dano) {
        this.nome = nome;
        this.tipoAtaque = tipoAtaque;
        this.dano = dano;
    }

    public void recebeBuff(int buff) {
        this.dano += buff;
        System.out.println("Sua arma agora tem: " + dano + " de dano.");
    }

    public void ataca() {
        System.out.println("Voce causou: " + dano + " de dano");
    }

    public String getNome() {
        return nome;
    }
}
