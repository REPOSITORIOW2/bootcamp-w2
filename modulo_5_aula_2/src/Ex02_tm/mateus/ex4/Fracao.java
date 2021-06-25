package Ex02_tm.mateus.ex4;

public class Fracao {
    private int numerador;
    private int denominador;

    public Fracao(int numerador, int denominador) {
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

    public void adicionar(Fracao fracao){
        if(this.denominador != fracao.getDenominador()){
            this.numerador = this.numerador * fracao.getDenominador() + fracao.getNumerador() * this.denominador;
            this.denominador *= fracao.getDenominador();
        }else{
            this.numerador += fracao.getNumerador();
        }
    }

    public void adicionar(int numero){
        this.adicionar(new Fracao(numero, 1));
    }

    public void subtrair(Fracao fracao){
        if(this.denominador != fracao.getDenominador()){
            this.numerador = this.numerador * fracao.getDenominador() - fracao.getNumerador() * this.denominador;
            this.denominador *= fracao.getDenominador();
        }else{
            this.numerador -= fracao.getNumerador();
        }
    }

    public void subtrair(int numero){
        this.subtrair(new Fracao(numero, 1));
    }

    public void multiplicar(Fracao fracao){
        this.numerador *= fracao.getNumerador();
        this.denominador *= fracao.getDenominador();
    }

    public void multiplicar(int valor){
        this.multiplicar(new Fracao(valor,1));
    }

    public void dividir(Fracao fracao){
        this.numerador *= fracao.getDenominador();
        this.denominador *= fracao.getNumerador();
    }

    public void dividir(int valor){
        this.dividir(new Fracao(valor, 1));
    }

    @Override
    public String toString(){
        return this.numerador + "/" + this.denominador;
    }
}
