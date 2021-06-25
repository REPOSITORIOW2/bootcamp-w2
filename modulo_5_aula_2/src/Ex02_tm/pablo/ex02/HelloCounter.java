public class HelloCounter {
    public static void main(String[] args) {
        Counter counter = new Counter();

        while(counter.getValue() != 99999){
            counter.increment();
            System.out.println(counter);
        }
    }   
}
