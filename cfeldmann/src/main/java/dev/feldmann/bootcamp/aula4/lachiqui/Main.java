package dev.feldmann.bootcamp.aula4.lachiqui;

import dev.feldmann.bootcamp.aula4.lachiqui.fogos.FogosApito;
import dev.feldmann.bootcamp.aula4.lachiqui.fogos.FogosCracker;
import dev.feldmann.bootcamp.aula4.lachiqui.fogos.FogosTiro;
import dev.feldmann.bootcamp.aula4.lachiqui.fogos.PacoteFogos;

public class Main {
    public static void main(String[] args) {

        Evento evento = new Evento();
        evento.inserirConvidados(
                new Convidado("Ednaldo Pereira", ConvidadoType.STANDARD),
                new Convidado("Porco Rodolfo", ConvidadoType.MELI),
                new Convidado("Cave Johnson", ConvidadoType.STANDARD),
                new Convidado("Sheila", ConvidadoType.MELI)
        );
        evento.inserirFogos(
                new FogosApito(),
                new FogosCracker(),
                new FogosTiro(),
                new PacoteFogos(
                        new FogosApito(),
                        new FogosTiro()
                ),
                new PacoteFogos(
                        new FogosTiro(),
                        new PacoteFogos(
                                new FogosCracker(),
                                new FogosTiro()
                        )
                )
        );
        evento.apagarVelas();
    }
}
