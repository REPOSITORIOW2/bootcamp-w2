import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class MyFactory {
    public static Object getInstance(String objName) throws IOException {

        switch (objName) {
            case ("package.HeapSortSorterImple"):
                return new HeapSortSorterImple();
            case ("package.BubbleSortSorterImple"):
                return new BubbleSortSorterImple();
            default:
                return new QuickSortSorterImple();
        }
    }

    public static String getSorter() throws IOException {
        Properties prop = new Properties();
        prop.load(new FileInputStream("src/MyFactory.properties"));

        return prop.getProperty("sorter");
    }
}
