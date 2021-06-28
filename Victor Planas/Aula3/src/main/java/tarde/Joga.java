package tarde;

public class Joga {
    public static void main(String[] args) {
        Personagem player = new Personagem("Arkvark", "Guerreiro", 1);
        Arma espada = new Arma("Espada dos anjos", "Perto", 15);
        Arma massa = new Arma("Massa gigante", "Perto", 30);
        Arma arco = new Arma("Arco superior", "Longe", 10);
        player.trocaArma(espada);
        player.getSlot().ataca();
        player.getSlot().recebeBuff(12);
        player.trocaArma(massa);
        player.getSlot().ataca();
        player.getSlot().recebeBuff(5);
        player.trocaArma(arco);
        player.getSlot().ataca();
        player.getSlot().recebeBuff(6);
    }
}
