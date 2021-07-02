package com.melibootcamp;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Convidado> convidados = Arrays.asList(
                new Convidado("Fulano", EnumTipoConvidado.MELI),
                new Convidado("Marilene", EnumTipoConvidado.MELI),
                new Convidado("Juan", EnumTipoConvidado.STANDARD),
                new Convidado("Kleber", EnumTipoConvidado.STANDARD)
        );
        //Entrega o bolo
        for (Convidado convidado:convidados
             ) {
            convidado.receberBolo();
        }
        //Criando a lista de fogos -  Fogos individuais, fogos individuais num pacote e pacotes com pacotes dentro
        List<FogoDeArtificio> fogoDeArtificios = Arrays.asList(
                new FogoDeArtificioIndividual("BUUUM","rosa"),
                new FogoDeArtificioIndividual("KATIAU","amarela"),
                new PacoteDeFogos(Arrays.asList(
                        new PacoteDeFogos(Arrays.asList(
                                new FogoDeArtificioIndividual("KSSSSSSS","azul"),
                                new FogoDeArtificioIndividual("UUUUUUUUUUUUU","vermelha"))),
                        new FogoDeArtificioIndividual("RATATATA","roxa"),
                        new FogoDeArtificioIndividual("SHEEESH","verde")))
                );

        //Explode os fogos :)
        for (FogoDeArtificio fogo:fogoDeArtificios
        ) {
            fogo.Explodir();
        }
    }
}
