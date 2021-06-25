package Ex02_tm.mateus.ex2;

public class Counter {
    private int valor;

    public Counter(){

    }

    public Counter(int valor) {
        this.valor = valor;
    }

    public Counter(Counter c){
        this.valor = c.getValor();
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void add(){
        this.valor++;
    }

    public void sub(){
        this.valor--;
    }
}