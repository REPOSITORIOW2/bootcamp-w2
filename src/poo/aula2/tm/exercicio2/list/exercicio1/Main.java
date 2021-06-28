package poo.aula2.tm.exercicio2.list.exercicio1;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) throws Exception {

        ContaCorrente cc1 = new ContaCorrente();
        Cliente victor = new Cliente("Victor", "111.111.111-38");

        cc1.setAgencia(1096);
        cc1.setNumeroConta(2024);
        cc1.setTitular(victor);
        cc1.deposito(turnInBg("100"));
        System.out.println(cc1.getSaldo());
        cc1.saque(turnInBg("50"));
        System.out.println(cc1.getSaldo());

        Cliente cliCC2 = new Cliente("Jose", "555.555.555-55");
        ContaCorrente cc2 = new ContaCorrente(1096, 1000, cliCC2);
        cc1.transferencia(turnInBg("25"), cc2);
        System.out.println(cc1);
        System.out.println(cc2);
        cc2.devolucaoPara(turnInBg("25"), cc1);
        System.out.println(cc1);
        System.out.println(cc2);

        ContaCorrente cc3 = new ContaCorrente(cc1);
        System.out.println(cc3);
    }

    public static BigDecimal turnInBg(String valor) {
        return new BigDecimal(valor);
    }
}
