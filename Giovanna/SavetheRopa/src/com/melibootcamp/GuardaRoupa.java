package com.melibootcamp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class GuardaRoupa {
    private  static Map<Integer, List<Vestuario>> roupas = new HashMap<Integer, List<Vestuario>>();
    private static int contador;

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        GuardaRoupa.contador = contador;
    }

    public Map<Integer, List<Vestuario>> getRoupas() {
        return roupas;
    }

    public void setRoupas(Map<Integer, List<Vestuario>> roupas) {
        this.roupas = roupas;
    }
    public Integer guardarVestuarios(List<Vestuario> listaDeVestuario){
        roupas.put(contador, listaDeVestuario);
        contador++;
        return contador-1;
    }
    public void mostrarVestuarios(){
        for (Map.Entry<Integer, List<Vestuario>> entry : roupas.entrySet()) {
            System.out.println("------------------------");
            System.out.println("Guarda roupas id: "+ entry.getKey());
            System.out.println("Roupas: ");
            for (Vestuario value : entry.getValue()) {
                System.out.println("\n" + value.toString());
            }
            System.out.println("------------------------");
        }
    }
    public List<Vestuario> devolverVestuarios(Integer id){
        return roupas.get(id);
    }

}
