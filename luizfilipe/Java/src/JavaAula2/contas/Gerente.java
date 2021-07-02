package JavaAula2.contas;

public class Gerente extends FuncionarioCLT {
    boolean metaBatida;
    double horaTrabalhada;

    public Gerente(boolean metaBatida) {
        super(6000, 6000 * (metaBatida ? 0.12 : 0));
        this.metaBatida = metaBatida;
        this.horaTrabalhada = 36;
    }
}
