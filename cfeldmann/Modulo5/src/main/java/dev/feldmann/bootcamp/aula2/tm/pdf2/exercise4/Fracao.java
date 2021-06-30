package dev.feldmann.bootcamp.aula2.tm.pdf2.exercise4;

import java.math.BigInteger;

public class Fracao {

    long numerador;
    long denominador;


    public Fracao(long numerador, long denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public void normalize() {

        // MMC
        var gcd = BigInteger.valueOf(numerador).gcd(BigInteger.valueOf(denominador)).longValue();

        this.numerador = this.numerador / gcd;
        this.denominador = this.denominador / gcd;
    }

    public Fracao add(Fracao fracao) {

        var resultNumerador = (numerador * fracao.denominador) + (denominador * fracao.numerador);
        var resultDenominador = denominador * fracao.denominador;

        return new Fracao(resultNumerador, resultDenominador);
    }

    public Fracao sub(Fracao fracao) {
        var resultNumerador = (numerador * fracao.denominador) - (denominador * fracao.numerador);
        var resultDenominador = denominador * fracao.denominador;


        return new Fracao(resultNumerador, resultDenominador);
    }

    public Fracao mult(Fracao fracao) {
        return new Fracao(
                numerador * fracao.numerador,
                denominador * fracao.denominador
                );
    }

    public Fracao div(Fracao fracao) {
        return new Fracao(
                numerador * fracao.denominador,
                denominador * fracao.numerador
                );
    }

    public Fracao add(int value) {
        return add(new Fracao(value, 1));
    }

    public Fracao sub(int value) {
        return sub(new Fracao(value, 1));
    }

    public Fracao mult(int value) {
        return mult(new Fracao(value, 1));
    }

    public Fracao div(int value) {
        return div(new Fracao(value, 1));
    }


    public long getDenominador() {
        return denominador;
    }

    public long getNumerador() {
        return numerador;
    }

    public double doubleValue() {
        return (double) this.numerador / (double) this.denominador;
    }

    @Override
    public String toString() {
        return numerador +
                "/" +
                denominador;
    }
}
