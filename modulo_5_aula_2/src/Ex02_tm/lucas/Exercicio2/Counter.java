package Exercicio2;

public class Counter {
    private int valor;

    public Counter() {

    }

    public Counter(int valor) {
        this.valor = valor;
    }

    public Counter(Counter counterCopia) {
        this.valor = counterCopia.getValor();
    }

    public void increment() {
        this.valor++;
    }

    public void decrement() {
        this.valor--;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Counter{" +
                "valor=" + valor +
                '}';
    }
}
