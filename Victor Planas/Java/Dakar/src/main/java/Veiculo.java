public class Veiculo {
    private int velocidade;
    private int aceleracao;
    private int anguloDeGiro;
    private String placa;
    private double peso;
    private int rodas;

    public Veiculo(int velocidade, int aceleracao, int anguloDeGiro, String placa, double peso, int rodas) {
        this.velocidade = velocidade;
        this.aceleracao = aceleracao;
        this.anguloDeGiro = anguloDeGiro;
        this.placa = placa;
        this.peso = peso;
        this.rodas = rodas;
    }

    public String getPlaca() {
        return placa;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public int getAceleracao() {
        return aceleracao;
    }

    public int getAnguloDeGiro() {
        return anguloDeGiro;
    }

    public double getPeso() {
        return peso;
    }

    public int getRodas() {
        return rodas;
    }
}
