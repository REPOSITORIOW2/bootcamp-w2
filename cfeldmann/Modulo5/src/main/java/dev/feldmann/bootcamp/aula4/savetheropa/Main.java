package dev.feldmann.bootcamp.aula4.savetheropa;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var guardaRoupa = new GuardaRoupa();

        int firstId = guardaRoupa.guardaVestuarios(Arrays.asList(
                new Vestuario("Link Camisas", "2020"),
                new Vestuario("Tenis3232", "Revolution")
        ));

        int secondId = guardaRoupa.guardaVestuarios(Arrays.asList(
                new Vestuario("Kichute", "Toca Preta")
        ));

        guardaRoupa.mostrarVestuarios();
        System.out.println("Devolvendo!");
        guardaRoupa.devolverVestuarios(firstId);
        guardaRoupa.mostrarVestuarios();
    }
}
