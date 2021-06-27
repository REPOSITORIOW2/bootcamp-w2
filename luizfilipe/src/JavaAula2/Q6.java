package JavaAula2;

import JavaAula2.contas.Senha;
import JavaAula2.contas.SenhaForte;
import JavaAula2.contas.SenhaFraca;

public class Q6 {
    public static void main(String[] args) {
        Senha senha1 = new SenhaForte();
        Senha senha2 = new SenhaFraca();

        String a = "1a34567";
        String b = "12345678ABCDEFGHabcdefgh$$$$$$$$$$";

        senha2.setValue(a);
        senha1.setValue(b);
    }
}
