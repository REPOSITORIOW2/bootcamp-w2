package JavaAula2.contas;

public class Analista extends FuncionarioCLT {
    boolean metaBatida;
    double horaTrabalhada;

    public Analista(boolean metaBatida) {
        super(4000, 4000 * (metaBatida ? 0.08 : 0));
        this.metaBatida = metaBatida;
        this.horaTrabalhada = 44;
    }
    
}
