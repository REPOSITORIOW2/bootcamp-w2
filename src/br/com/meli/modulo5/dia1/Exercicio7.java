package br.com.meli.modulo5.dia1;

public class Exercicio7 {

    public static void main(String[] args) {
//        Exercício 2:  Em 2021 uma startup de tecnologia, denominada de “Empresa X” é avaliada em 1,13 milhão e
//        possui uma média de crescimento anual de 148%, uma concorrente do ramo, “Empresa Y”, é avaliada em 18,4 milhões
//        e com sua média de crescimento anual em 32%.

//        Considerando este cenário, imprima no console (conforme formatação acima) a evolução anual até que a empresa X ultrapasse a empresa Y
//        em seu valor de empresa.

        int anoBase = 2021;//Pro controle e pra apresentar no Sysout
        double valorEmpresaX= 1.13;
        double crescimentoAnualEmpresaX = 1 + 1.48;//crescimento de 148%
        double valorEmpresaY = 18.4;
        double crescimentoAnualEmpresaY = 1+0.32;//crescimento de 32%
        while(valorEmpresaX<valorEmpresaY){
            valorEmpresaX*=crescimentoAnualEmpresaX;
            valorEmpresaY*=crescimentoAnualEmpresaY;
            System.out.println("Empresa X - "+anoBase+" - Valor da empresa: "+valorEmpresaX+"m");
            System.out.println("Empresa Y - "+anoBase+" - Valor da empresa: "+valorEmpresaY+"m");
            anoBase++;
        }
    }
}
