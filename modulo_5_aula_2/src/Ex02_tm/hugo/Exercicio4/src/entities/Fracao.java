package entities;

public class Fracao {
    private int numerador;
    private int denominador;

    public Fracao(){

    }

    public Fracao(int numerador, int denominador){
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public void adicionar(Fracao segundaFracao){
        if (this.denominador != segundaFracao.getDenominador()){
            this.denominador *= segundaFracao.getDenominador();
        }
        this.numerador += segundaFracao.getNumerador();
    }

    public void adicionar(int numeroInteiro){
        this.numerador += numeroInteiro;
    }

    public void subtrair(Fracao segundaFracao){
        if (this.denominador != segundaFracao.getDenominador()){
            this.denominador *= segundaFracao.getDenominador();
        }
        this.numerador -= segundaFracao.getNumerador();
    }

    public void subtrair(int numeroInteiro){
        this.numerador -= numeroInteiro;
    }

    public void multiplicar(Fracao segundaFracao){
        this.numerador *= segundaFracao.getNumerador();
        this.denominador *= segundaFracao.getDenominador();
    }

    public void multiplicar(int numeroInteiro){
        this.numerador *= numeroInteiro;
    }

    public void dividir(Fracao segundaFracao){
        this.numerador *= segundaFracao.getDenominador();
        this.denominador *= segundaFracao.getNumerador();
    }

    public void dividir(int numeroInteiro){
        this.denominador *= numeroInteiro;
    }

    @Override
    public String toString() {
        return numerador + "/" + denominador;
    }
}
