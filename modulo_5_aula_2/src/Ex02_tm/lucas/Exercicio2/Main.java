package Exercicio2;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter(0);

        System.out.println(counter);
        counter.increment();
        System.out.println(counter);
        counter.decrement();
        System.out.println(counter);
    }
}
