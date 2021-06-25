/*
Crie uma classe Counter (sim, contador de programação) com métodos que permitam aumentar e diminuir seu valor.
A classe conterá um construtor padrão, um construtor com parâmetros, um construtor de cópia e os setters e getters
correspondentes (métodos de acesso).
 */

package application;

import entities.Counter;
import exceptions.IncDecException;

public class Main {
    public static void main(String[] args) {
        Counter counter1 = new Counter();
        Counter counter2 = new Counter(45);
        Counter counter3 = new Counter(counter2);

        System.out.println("Contador 2: " + counter2.getNumeroContagem());
        System.out.println("Contador 3: " + counter3.getNumeroContagem());
        try{
            counter2.aumentaContagem(10);
        }catch(IncDecException ex){
            System.out.println(ex.getMessage());
        }

        System.out.println("Contador 2: " + counter2.getNumeroContagem());

    }

}
