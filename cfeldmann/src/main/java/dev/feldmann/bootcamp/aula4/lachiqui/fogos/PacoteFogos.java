package dev.feldmann.bootcamp.aula4.lachiqui.fogos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PacoteFogos implements Fogos {

    private List<Fogos> fogos;

    public PacoteFogos(List<Fogos> fogos) {
        this.fogos = fogos;
    }

    public PacoteFogos(Fogos... fogos){
        this.fogos = new ArrayList<>(Arrays.asList(fogos));
    }


    @Override
    public void explodir() {
        if (fogos != null && !fogos.isEmpty()) {
            fogos.forEach(Fogos::explodir);
        }
    }
}
