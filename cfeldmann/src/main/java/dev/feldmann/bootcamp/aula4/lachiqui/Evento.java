package dev.feldmann.bootcamp.aula4.lachiqui;

import dev.feldmann.bootcamp.aula4.lachiqui.fogos.Fogos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Evento {


    private List<Convidado> convidados;
    private List<Fogos> fogos;

    public Evento() {
        convidados = new ArrayList<>();
        fogos = new ArrayList<>();
    }

    public void inserirConvidados(Convidado... convidados) {
        this.convidados.addAll(Arrays.asList(convidados));
    }

    public void inserirFogos(Fogos... fogos){
        this.fogos.addAll(Arrays.asList(fogos));
    }

    public void apagarVelas() {
        System.out.println("Começando o evento!");
        System.out.println("Apagando velas");
        System.out.println();
        explodirFogos();
        distribuirBolo();
    }


    private void explodirFogos() {
        System.out.println("Em breve fogos de artificio:");
        fogos.forEach(Fogos::explodir);
        System.out.println();
    }

    private void distribuirBolo() {
        System.out.println("Servindo bolo para os convidados:");
        convidados.forEach(Convidado::comerBolo);
        System.out.println();
    }

}
