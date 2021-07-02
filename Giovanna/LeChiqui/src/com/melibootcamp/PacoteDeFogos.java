package com.melibootcamp;

import java.util.List;

public class PacoteDeFogos implements FogoDeArtificio{
    List<FogoDeArtificio> fogos;

    @Override
    public void Explodir() {
        for (int i= 0 ; i< fogos.size(); i++){
            fogos.get(i).Explodir();
        }
    }

    public List<FogoDeArtificio> getFogos() {
        return fogos;
    }

    public void setFogos(List<FogoDeArtificio> fogos) {
        this.fogos = fogos;
    }
    public void adicionarFogos(FogoDeArtificio fogo){
        fogos.add(fogo);
    }

    public PacoteDeFogos(List<FogoDeArtificio> fogos) {
        this.fogos = fogos;
    }
}
