package TT;

public class TestPersonagem {

    public static void main(String[] args) {
        Personagem heroi = new Personagem("Cleison", "Paladino", 1);

        Arma arcoLongo = new Arco(50, 100);
        Arma espadaCurta = new Espada(75);
        Arma lancaNobre = new Lanca(5, 65);

        heroi.insereNaMochila(arcoLongo);
        heroi.insereNaMochila(espadaCurta);
        heroi.insereNaMochila(lancaNobre);

        System.out.println("-----------Com Arco");

        heroi.trocaArma(0);
        heroi.slot.atacar();

        System.out.println("-----------Com Espada");

        heroi.trocaArma(1);
        heroi.slot.atacar();

        System.out.println("-----------Com Lanca");

        heroi.trocaArma(2);
        heroi.slot.atacar();

    }


}
