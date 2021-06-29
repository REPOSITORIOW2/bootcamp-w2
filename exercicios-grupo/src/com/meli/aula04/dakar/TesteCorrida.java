package com.meli.aula04.dakar;

import java.math.BigDecimal;

public class TesteCorrida {

    public static void main(String[] args) {
        Corrida corrida = new Corrida(
                new BigDecimal("985000.00"), "Copa pistão", 10
        );

        corrida.registarCarro(100, 5, -20, "AB");
        corrida.registarCarro(100, 6, -20, "ABC");
        corrida.registarCarro(110, 6, -20, "ABCD");
        corrida.registarCarro(5, 2, -22, "ABED");

        corrida.socorrer("AB");

        corrida.removerVeiculo("ABCD");

        System.out.println(corrida.vencedor());


    }
}

