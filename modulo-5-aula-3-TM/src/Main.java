import java.io.IOException;
import java.util.Comparator;

public class Main<arrayString> {
    public static void main(String[] args) throws IOException {

        Time time = new Time();

        Integer[] array = {30, 27, 34, 21, 1, 2, 56, 10};

        Sorter<Integer> sorter = (Sorter<Integer>) MyFactory.getInstance(MyFactory.getSorter());
        sorter.sort(array, Comparator.comparing(Integer::intValue));

        for (int i : array) {
            System.out.println(i);
        }

        String[] arrayString = {"Felipe", "Castro", "Souza", "Dos", "Santos"};

        Sorter<String> sorterString = (Sorter<String>) MyFactory.getInstance(MyFactory.getSorter());
        sorterString.sort(arrayString, Comparator.comparing(String::toString));

        for(String s : arrayString) {
            System.out.println(s);
        }

    }
}
