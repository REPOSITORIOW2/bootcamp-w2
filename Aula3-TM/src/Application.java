import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class Application {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException{
        String sArr[] = {"A", "Z", "W", "R", "P", "B"};
        String sArr2[] = {"B", "U", "C", "A", "P", "B"};
        Integer iArr[] = {4,6,3,12,7,5,2};

        QuickSortSorterImple<Integer> intSorter = (QuickSortSorterImple<Integer>) MyFactory.getInstance("sorterQuick");
        intSorter.sort(iArr, null);

        BubbleSortSorterImple<String> strSorter = (BubbleSortSorterImple<String>) MyFactory.getInstance("sorterBubble");
        strSorter.sort(sArr, null);

        HeapSortSorterImple<String> strSorterHeap = (HeapSortSorterImple<String>) MyFactory.getInstance("sorterHeap");
        strSorterHeap.sort(sArr2, null);

        System.out.println(Arrays.toString(iArr));
        System.out.println(Arrays.toString(sArr));
        System.out.println(Arrays.toString(sArr2));
    }    
}
