import java.util.ArrayList;
import java.util.List;

public class Evento {
    private String aniversariante = "La Chiqui";
    private List<Convidado> listaDeConvidado;

    public Evento(List<Convidado> listaDeConvidado) {
        this.listaDeConvidado = listaDeConvidado;
    }


    void apagaVelas(GerenciadorDeFogos gerenciadorFogos) {
        explodeFogos(gerenciadorFogos);
        divideObolo();
    }


    private void divideObolo() {
        for (Convidado convidado : listaDeConvidado) {
            if (convidado instanceof Meliciano) System.out.println("Viva La chiqui !!");
        }
    }

    private void explodeFogos(GerenciadorDeFogos gerenciadorFogos) {
        for (Explosivo fogos : gerenciadorFogos.getTodosOsFogos()) {
            fogos.explode();
        }
    }

    public static void main(String[] args) {
        List<Convidado> lista = new ArrayList<>();

        lista.add(new Meliciano("Bertino", 21, false));
        lista.add(new Meliciano("Certino", 24, false));
        lista.add(new Normal("Geraldo", 55, false));
        lista.add(new Meliciano("Dionisio", 43, true));
        lista.add(new Meliciano("Chega", 33, false));
        lista.add(new Normal("Albertinho", 22, true));

        Evento festa = new Evento(lista);

        Explosivo e1 = new Batom("De artificio", 30, "Bomba mexicana");
        Explosivo e2 = new Rojao("Especial", 52, "Batom");
        Explosivo e3 = new Track("Colorido", 13, "Traque");
        Explosivo e4 = new Rojao("Barulhento", 5, "Arvore de natal");
        Explosivo e5 = new Batom("De artificio", 30, "Kaboom 2000");
        Explosivo e6 = new Rojao("Colorido", 10, "Xploder");
        Explosivo e7 = new Track("Especial", 100, "Boom boom");


        List<Explosivo> lista2 = new ArrayList<>();
        lista2.add(e2);
        lista2.add(e7);
        Explosivo pacote = new PacoteDeExplosivos(lista2);

        GerenciadorDeFogos gerenciadorFogos = new GerenciadorDeFogos();

        gerenciadorFogos.adicionaFogos(e1);
        gerenciadorFogos.adicionaFogos(e3);
        gerenciadorFogos.adicionaFogos(e4);
        gerenciadorFogos.adicionaFogos(e5);
        gerenciadorFogos.adicionaFogos(e6);
        gerenciadorFogos.adicionaFogos(pacote);

        festa.apagaVelas(gerenciadorFogos);
    }
}
