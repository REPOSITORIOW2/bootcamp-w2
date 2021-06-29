package com.meli.aula04.str;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaRoupa {
    private int contador;
    private Map<Integer, List> local = new HashMap<Integer, List>();

    public Integer guardarVestuarios(List<Vestuario> listaVestuario) {
        contador = local.values().size();

        local.put(contador, listaVestuario);

        return contador;
    }

    public void mostrarVestuarios() {
        System.out.println("\n Todas roupas:");
        local.forEach((a,b) -> System.out.println("Indice: " + a + " - Lista: " + b));
    }

    public List<Vestuario> devolverVestuarios(Integer id) {
        return local.get(id);
    }

}
