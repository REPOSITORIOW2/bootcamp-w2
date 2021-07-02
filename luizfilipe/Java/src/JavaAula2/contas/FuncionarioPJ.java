package JavaAula2.contas;

public class FuncionarioPJ extends Funcionario {
    double horasTrabalho;
    double valorHora;

    public FuncionarioPJ(double horasTrabalho, double valorHora) {
        super(horasTrabalho * valorHora);
        this.horasTrabalho = horasTrabalho;
        this.valorHora = valorHora;
    }
    
}
