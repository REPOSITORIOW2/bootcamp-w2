package Ex02_tm.wincenty;

public class Fracao {

    private int denominador;
    private int numerador;


    public Fracao(int numerador, int denominador) {
        this.denominador = denominador;
        this.numerador = numerador;
    }

    public void add(Fracao other) {
        if(this.denominador == other.denominador)
            this.numerador += other.getNumerador();
        else {
            this.numerador = (this.numerador * other.getDenominador()) + (this.denominador * other.getNumerador());
            this.denominador *= other.getDenominador();
        }
    }

    public void add(int nbr) {
         this.numerador = (this.denominador * nbr) + this.numerador;
    }

    public void sub(Fracao other) {
        if(this.denominador == other.denominador)
            this.numerador -= other.getNumerador();
        else {
            this.numerador = (this.numerador * other.getDenominador()) - (this.denominador * other.getNumerador());
            this.denominador *= other.getDenominador();
        }
    }

    public void sub(int nbr) {
         this.numerador = (this.denominador * nbr) - this.numerador;
    }

    public void mul(Fracao other) {
        this.numerador *= other.numerador;
        this.denominador *= other.denominador;
    }

    public void mul(int nbr) {
        this.numerador *= nbr;
    }

    public void div(Fracao other) {
        this.numerador *= other.denominador;
        this.denominador *= other.numerador;
    }

    public void div(int nbr) {
        this.numerador *= nbr;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    @Override
    public String toString() {
        return this.numerador + "/" + this.denominador;
    }
}
