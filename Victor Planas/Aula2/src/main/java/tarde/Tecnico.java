package tarde;

public class Tecnico extends Funcionario{

    Tecnico(double salario, int jornadaDeTrabalho) {
        super(salario, jornadaDeTrabalho);
    }

    public void recebeBonificacao(double metasBatidas, Funcionario f) {
        setSalario(1.05*metasBatidas + f.getSalario());
    }
}
