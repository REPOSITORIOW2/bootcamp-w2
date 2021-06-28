package JavaAula2;

import JavaAula2.contas.ContaCorrente;

public class Q2 {
    public static void main(String[] args) {
        ContaCorrente user1 = new ContaCorrente("11111", 1000);
        ContaCorrente user2 = new ContaCorrente("22222", 500);
        ContaCorrente user3 = new ContaCorrente(user1);

        ContaCorrente.transferencia(user1, user2, 300);
        
        user1.extrato();
        user2.extrato();
        user3.extrato();
    }
}
