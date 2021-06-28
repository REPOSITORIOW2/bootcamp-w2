package tarde;

public class Counter {
    private int contador = 0;

    Counter(){}

    Counter(int numeroInicial){
        this.contador = contador;
    }

    Counter(Counter c){
        this.contador = c.getContador();
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
}
