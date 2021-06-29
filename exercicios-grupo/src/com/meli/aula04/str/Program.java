package com.meli.aula04.str;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

public class Program {
    public static void main(String[] args) {
        List<Vestuario> vestuarios1 = Arrays.asList(new Vestuario("Nike", "Airmax"),
                new Vestuario("Adidas", "Camisa"));

        List<Vestuario> vestuarios2 = Arrays.asList(new Vestuario("PoloUk", "Camisa Polo"),
                new Vestuario("Puma", "Camisa"));

        GuardaRoupa guardaRoupa = new GuardaRoupa();



        System.out.println("Roupa alocada no espaco: " + guardaRoupa.guardarVestuarios(vestuarios1));
        System.out.println("Roupa alocada no espaco: " + guardaRoupa.guardarVestuarios(vestuarios1));

        System.out.println("Roupas guardadas no espaco " + 0 + " :" + guardaRoupa.devolverVestuarios(0));

        guardaRoupa.mostrarVestuarios();
    }
}
