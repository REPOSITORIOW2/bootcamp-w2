/*
Crie uma classe Conta Corrente, com os métodos, saque, devolução e tranferência.
A classe conterá um construtor padrão, um com parâmetros e outro que receberá uma conta corrente da qual
copiará todos os seus dados.
Além disso, os métodos de acesso devem ser desenvolvidos para cada variável de instância da classe,
desenvolvendo um método set e outro método get.
 */
package application;


import entities.ContaCorrente;
import exception.DepositoException;
import exception.SaqueException;
import exception.TransferenciaException;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        ContaCorrente cc1 = new ContaCorrente();
        cc1.setNumeroConta("999");
        cc1.setNomeTitular("Joao");
        try{
            cc1.deposita(300);
        } catch(DepositoException ex){
            System.out.println(ex.getMessage());
        }
        ContaCorrente cc2 = new ContaCorrente(557, "4523", "Hugo");
        try{
            cc2.saca(500);
        } catch(SaqueException ex){
            System.out.println(ex.getMessage());
        }
        ContaCorrente cc3 = new ContaCorrente(cc2);

        System.out.println(cc1.toString());
        System.out.println(cc2.toString());
        System.out.println(cc3.toString());

        try{
            cc3.transferencia(cc2, 50);
        }catch(TransferenciaException | DepositoException e){
            System.out.println(e.getMessage());
        }
        System.out.println(cc1.toString());
        System.out.println(cc2.toString());
        System.out.println(cc3.toString());
    }
}
