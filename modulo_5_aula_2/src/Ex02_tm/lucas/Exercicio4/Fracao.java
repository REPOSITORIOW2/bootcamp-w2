package Exercicio4;

public class Fracao {
    private int numerador;
    private int denominador;

    public Fracao() {}

    public Fracao(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public void adicionar(Fracao fracao) {
        if (this.denominador == fracao.getDenominador()) {
            this.numerador += fracao.getNumerador();
        } else {
            int newDenominador = MMC.calcular(this.denominador, fracao.getDenominador());
            this.numerador = this.numerador * (newDenominador / this.denominador);
            fracao.setNumerador(fracao.getNumerador() * (newDenominador / fracao.getDenominador()));
            this.numerador += fracao.getNumerador();
            this.denominador = newDenominador;
        }
    }

    public void adicionar(int num) {
        num *= this.denominador;
        this.numerador += num;
    }

    public void subtrair(Fracao fracao) {
        if (this.denominador == fracao.getDenominador()) {
            this.numerador -= fracao.getNumerador();
        } else {
            int newDenominador = MMC.calcular(this.denominador, fracao.getDenominador());
            this.numerador = this.numerador * (newDenominador / this.denominador);
            fracao.setNumerador(fracao.getNumerador() * (newDenominador / fracao.getDenominador()));
            this.numerador -= fracao.getNumerador();
            this.denominador = newDenominador;
        }
    }

    public void subtrair(int num) {
        num *= this.denominador;
        this.numerador -= num;
    }

    public void multiplicar(Fracao fracao) {
        this.numerador *= fracao.getNumerador();
        this.denominador *= fracao.getDenominador();
    }

    public void multiplicar(int num) {
        this.numerador *= num;
    }

    public void dividir(Fracao fracao) {
        Fracao fracaoInversa = new Fracao(fracao.getDenominador(), fracao.getNumerador());
        multiplicar(fracaoInversa);
    }

    public void dividir(int num) {
        Fracao fracaoInversa = new Fracao(1, num);
        multiplicar(fracaoInversa);
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

    @Override
    public String toString() {
        return "Fracao{" +
                "numerador=" + numerador +
                ", denominador=" + denominador +
                '}';
    }
}
