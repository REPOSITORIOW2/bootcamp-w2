/**
 * Crie uma classe Counter (sim, contador de programação) com métodos que permitam 
 * aumentar e diminuir seu valor. A classe conterá um construtor padrão, um construtor
 * com parâmetros, um construtor de cópia e os setters e getters correspondentes (métodos de acesso).
*/

public class Counter {
    
    private int value = 0;

    public Counter (){}

    public Counter (int value){
        this.value = value;
    }

    public Counter (Counter copy){
        this.setValue(copy.getValue());
    }

    public int getValue(){
        return this.value;
    }

    private void setValue(int v){
        this.value = v;
    }

    public void increment(){
        this.value++;
    }

    public void decrement(){
        if (this.value >= 0)
            this.value--;
    }

    public void reset(){
        this.value = 0;
    }

    public String toString(){
        return Integer.valueOf(this.value).toString();
    }
}