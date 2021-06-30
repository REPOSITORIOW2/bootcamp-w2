package Dakar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Corrida corridaMaluca = new Corrida(8000, 2500 ,"Corida Maluca", 25);

        corridaMaluca.registrarCarro(200,34,10,"AAA1234");
        corridaMaluca.registrarCarro(150,67,7,"AAB1234");
        corridaMaluca.registrarCarro(100,4,5,"XAA1234");
        corridaMaluca.registrarCarro(58,12,4,"ADF1234");

        corridaMaluca.registrarMoto(67,12,6,"BDF0934");
        corridaMaluca.registrarMoto(89,12,3,"BDF7834");
        corridaMaluca.registrarMoto(100,12,4,"BDH1234");
        corridaMaluca.registrarMoto(23,12,7,"BGF1234");


        System.out.println(corridaMaluca.getVeiculos());

        corridaMaluca.removerVeiculo(corridaMaluca.getVeiculos().get(0));
        corridaMaluca.removerVeiculoPorPlaca("BDH1234");

        System.out.println(corridaMaluca.getVeiculos());
        System.out.println(corridaMaluca.getVencedor());

        corridaMaluca.socorrerCarro("XAA1234");
        corridaMaluca.socorrerMoto("BDF7834");



    }
}
