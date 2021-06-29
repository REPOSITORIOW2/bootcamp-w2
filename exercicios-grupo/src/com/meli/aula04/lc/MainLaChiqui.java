package com.meli.aula04.lc;

import java.util.ArrayList;
import java.util.List;

public class MainLaChiqui {

    public static void explodeFogos(List<List<FogoArtificio>> pacote){
        for (List<FogoArtificio> lo: pacote) {
            for (FogoArtificio o : lo) {
                System.out.println(o.getBarulho());
            }
        }
    }

    public static void distribuiPorcao(List<Convidado> listaConvidados){

        for (Convidado o : listaConvidados) {
            if(o instanceof ConvidadoMeli) {
                System.out.println(((ConvidadoMeli)o).getGrito());
            }
        }

    }

    public static void main(String[] args) {
        ConvidadoMeli c1 = new ConvidadoMeli("ana", 30);
        ConvidadoMeli c2 = new ConvidadoMeli("arthur", 18);
        ConvidadoStandard c3 = new ConvidadoStandard("lucas", 25);
        ConvidadoStandard c4 = new ConvidadoStandard("julia", 22);

        List<Convidado> listaConvidados = new ArrayList<>();

        listaConvidados.add(c1);
        listaConvidados.add(c3);
        listaConvidados.add(c2);
        listaConvidados.add(c4);

        FogoArtificio fogo1 = new FogoArtificio("fogo1", "bum!");
        FogoArtificio fogo2 = new FogoArtificio("fogo2", "boom!");
        FogoArtificio fogo3 = new FogoArtificio("fogo3", "shiiii!");

        List<List<FogoArtificio>> pacote = new ArrayList<>();

        List<FogoArtificio> fogosPacote1 = new ArrayList<>();

        List<FogoArtificio> fogos1 = new ArrayList<>();

        fogos1.add(fogo1);
        fogosPacote1.add(fogo2);
        fogosPacote1.add(fogo3);

        pacote.add(fogos1);
        pacote.add(fogosPacote1);

        explodeFogos(pacote);
        distribuiPorcao(listaConvidados);
    }
}
