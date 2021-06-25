package Ex02_tm.mateus.ex2;
//Crie uma classe Counter (sim, contador de programação) com métodos que permitam aumentar e diminuir seu valor.
//A classe conterá um construtor padrão, um construtor com parâmetros, um construtor de cópia e os setters e getters correspondentes (métodos de acesso).


public class Main {

    public static void main(String[] args) {
        Counter counter = new Counter();
        Counter counter1 = new Counter(10);
        Counter counter2 = new Counter(counter1);

        counter1.add();
        counter2.sub();

        System.out.println(counter1.getValor());
        System.out.println(counter2.getValor());
    }
}