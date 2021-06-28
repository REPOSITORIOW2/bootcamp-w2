import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws IOException {

        Integer[] array = {30, 27, 34, 21, 1, 2, 56, 10};

        Sorter sorter = (Sorter) MyFactory.getInstance(MyFactory.getSorter());
        sorter.sort(array, null);

        for (int i : array) {
            System.out.println(i);
        }

    }
}
