package JavaAula2.contas;

public abstract class FuncionarioCLT extends Funcionario{
    double salarioBase;
    double bonificacao;

    public FuncionarioCLT(double salarioBase, double bonificacao) {
        super(salarioBase + bonificacao);
        this.salarioBase = salarioBase;
        this.bonificacao = bonificacao;
    }
}
