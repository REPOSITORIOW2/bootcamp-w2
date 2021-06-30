package Dakar;

public abstract class Veiculo {

    private int velocidade;
    private int aceleracao;
    private int anguloDoGiro;
    private String placa;
    private int peso;
    private int rodas;

    @Override
    public String toString() {
        return "Veiculo{" +
                "velocidade=" + velocidade +
                ", aceleracao=" + aceleracao +
                ", anguloDoGiro=" + anguloDoGiro +
                ", placa='" + placa + '\'' +
                ", peso=" + peso +
                ", rodas=" + rodas +
                '}';
    }

    public Veiculo(){

    }
    public Veiculo(String placa, int peso, int rodas) {
        this.placa = placa;
        this.peso = peso;
        this.rodas = rodas;
    }


    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getAceleracao() {
        return aceleracao;
    }

    public void setAceleracao(int aceleracao) {
        this.aceleracao = aceleracao;
    }

    public int getAnguloDoGiro() {
        return anguloDoGiro;
    }

    public void setAnguloDoGiro(int anguloDoGiro) {
        this.anguloDoGiro = anguloDoGiro;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getRodas() {
        return rodas;
    }

    public void setRodas(int rodas) {
        this.rodas = rodas;
    }


}
