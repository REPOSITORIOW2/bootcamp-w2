package Ex02_tm.wincenty;

public class TesteCounter {
    public static void main(String[] args) {
        Counter contador = new Counter();
        int i = 0;
        while (i<10) {
            contador.increaseCounter();
            i++;
        }
        System.out.println(contador.getCounter());

        contador.decreaseCounter();
        contador.decreaseCounter();

        System.out.println(contador.getCounter());
    }
}
