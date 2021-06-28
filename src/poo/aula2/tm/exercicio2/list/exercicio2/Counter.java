package poo.aula2.tm.exercicio2.list.exercicio2;

/*
Crie uma classe Counter (sim, contador de programação) com métodos que permitam aumentar e diminuir seu valor.
A classe conterá um construtor padrão, um construtor com parâmetros, um construtor de cópia
e os setters e getters correspondentes (métodos de acesso).
 */

public class Counter {

    private long value;

    public Counter(int value) {
        this.value = value;
    }

    public Counter() {
    }

    public Counter(Counter counter) {
        this.value = counter.value;
    }

    public long getValue() {
        return value;
    }

    public void setValue(long value) {
        this.value = value;
    }

    public void addValue(int sum){
        this.value+=sum;
    }

    public void removeValue(int sum){
        this.value+=sum;
    }
}
