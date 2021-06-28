import java.io.FileInputStream;
import java.io.IOException;
import java.util.Comparator;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws IOException {

        Integer[] array = {30, 27, 34, 21, 1, 2, 56, 10};

        Sorter<Integer> sorter = (Sorter<Integer>) MyFactory.getInstance(MyFactory.getSorter());
        sorter.sort(array, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });

        for (int i : array) {
            System.out.println(i);
        }

    }
}
