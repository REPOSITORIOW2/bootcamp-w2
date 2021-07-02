package JavaAula2;

import JavaAula2.contas.Analista;
import JavaAula2.contas.Diretor;
import JavaAula2.contas.Funcionario;
import JavaAula2.contas.FuncionarioCLT;
import JavaAula2.contas.FuncionarioPJ;
import JavaAula2.contas.Gerente;

public class Q8 {
    public static void main(String[] args) {
        Funcionario func1 = new Analista(true);
        Funcionario func2 = new Gerente(true);
        Funcionario func3 = new Diretor(true, 10000);
        Funcionario func4 = new FuncionarioPJ(40, 100);

        func1.pagarSalario();
        func2.pagarSalario();
        func3.pagarSalario();
        func4.pagarSalario();
    }
}
