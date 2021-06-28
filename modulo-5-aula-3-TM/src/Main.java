import java.io.IOException;
import java.util.Comparator;


public class Main<arrayString> {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Time time = new Time();

        time.start();

        Integer[] valores = generateArray(5000);

        Sorter<Integer> matriz = (Sorter<Integer>) MyFactory.getInstance("");

        matriz.sort(valores, new  Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });

        time.stop();

        System.out.println(time.elapsedTime());

    }

    public static Integer[] generateArray(int n) {
        Integer[] arr = new Integer[n];
        int i = 0;
        while (i < n) {
            arr[i] = n - i;
            i++;
        }
        return arr;
    }
}
