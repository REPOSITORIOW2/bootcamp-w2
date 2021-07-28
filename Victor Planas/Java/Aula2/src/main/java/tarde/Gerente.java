package tarde;

public class Gerente extends Funcionario{
    private int descansoPago;

    Gerente(double salario, int jornadaDeTrabalho,int descansoPago) {
        super(salario, jornadaDeTrabalho);
        this.descansoPago = descansoPago;
    }

    public void recebeBonificacao(double metasBatidas, Funcionario f) {
        setSalario(1.125*metasBatidas + f.getSalario());
    }
}
