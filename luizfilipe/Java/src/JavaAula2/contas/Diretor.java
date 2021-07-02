package JavaAula2.contas;

public class Diretor extends FuncionarioCLT {
    boolean metaBatida;

    public Diretor(boolean metaBatida, double lucro) {
        super(15000, lucro * (metaBatida ? 0.03 : 0));
        this.metaBatida = metaBatida;
    }
}
