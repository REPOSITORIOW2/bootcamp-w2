package com.aula24.tm.parte2;

/**
 * Em 2021 uma startup de tecnologia, denominada de “Empresa X” é avaliada em 1,13
 * milhão e possui uma média de crescimento anual de 148%, uma concorrente do ramo,
 * “Empresa Y”, é avaliada em 18,4 milhões e com sua média de crescimento anual em 32%.
 */
public class Exercicio2 {

    public static void main(String[] args) {
        //Empresa X - 01/01/2021 - Valor da empresa: 1,13m
        //Empresa Y - 01/01/2021 - Valor da empresa: 18,4

        double valorX = 1130000;
        double valorY = 18400000;

        double crescimentoX = 1.48;
        double crescimentoY = 0.32;

        int ano = 2021;
        while (valorX < valorY) {
            ano++;

            valorX += valorX * crescimentoX;
            valorY += valorY * crescimentoY;

            System.out.printf("Empresa X - 01/01/%d - Valor da Empresa: %.2fm\n", ano, valorX/1000000);
            System.out.printf("Empresa Y - 01/01/%d - Valor da Empresa: %.2fm\n\n", ano, valorY/1000000);
        }
    }
}
