package JavaAula2.ensino;

public class Fracao {
    public Fracao(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    int numerador;
    int denominador;

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

    public void soma(Fracao addFrac) {
        this.numerador = (addFrac.getDenominador() * this.numerador) + addFrac.getNumerador() * this.denominador;
        this.denominador *= addFrac.getDenominador();
    }

    public void multiplicacao(Fracao addFrac) {
        this.numerador *= addFrac.getNumerador();
        this.denominador *= addFrac.getDenominador();
    }

    @Override
    public String toString() {
        return "Fracao [numerador=" + numerador + ", denominador=" + denominador + "]";
    }
}
