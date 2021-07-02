package com.melibootcamp;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	 List<Vestuario> vestuario = Arrays.asList(new Vestuario[]{
	         new Vestuario("Forever 21", "Saia"),
             new Vestuario("Zara", "Jaqueta"),
     });
	 GuardaRoupa guardaRoupa =  new GuardaRoupa();
	 //Insere roupas em um guarda roupa
	 var idVestuario = guardaRoupa.guardarVestuarios(vestuario);
	 //Retorna roupas de um guarda roupa especifico
	 var roupasGuardadas = guardaRoupa.devolverVestuarios(idVestuario);
	 //Imprime guarda roupa especifico
        for (Vestuario value : roupasGuardadas) {
            System.out.println("\n" + value.toString());
        }
        //Imprime todos os guarda roupas e roupas
        guardaRoupa.mostrarVestuarios();
    }
}
