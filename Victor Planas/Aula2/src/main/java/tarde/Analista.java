package tarde;

public class Analista extends Funcionario{
    private int descansoRemunderado;

    Analista(double salario, int jornadaDeTrabalho, int descansoRemunderado) {
        super(salario, jornadaDeTrabalho);
        this.descansoRemunderado = descansoRemunderado;
    }

    public void recebeBonificacao(double metasBatidas, Funcionario f) {
        setSalario(1.08*metasBatidas + f.getSalario());
    }
}
