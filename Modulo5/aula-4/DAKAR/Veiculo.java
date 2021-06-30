public abstract class Veiculo {

    protected double velocidade;
    protected double aceleracao;
    protected double anguloDeGiro;
    protected String placa;
    protected final double peso;
    protected final int rodas;

    Veiculo(double velocidade, double aceleracao, double anguloDeGiro, String placa, double peso, int rodas) {
        this.velocidade = velocidade;
        this.aceleracao = aceleracao;
        this.anguloDeGiro = anguloDeGiro;
        this.placa = placa;
        this.peso = peso;
        this.rodas = rodas;
    }

    public String getClassName() {
        return this.getClass().getName().toLowerCase();
    }

    public double getVelocidade() {
        return this.velocidade;
    }

    public double getAceleracao() {
        return this.aceleracao;
    }

    public double getAnguloDeGiro() {
        return this.anguloDeGiro;
    }

    public String getPlaca() {
        return this.placa;
    }

    public double getPeso() {
        return this.peso;
    }

    public int getRodas() {
        return this.rodas;
    }

}