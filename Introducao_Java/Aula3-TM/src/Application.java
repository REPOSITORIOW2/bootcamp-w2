import java.lang.reflect.InvocationTargetException;

@SuppressWarnings("unchecked")
public class Application {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException{
        Integer arr[] = new Integer[5000];
        int valor = 5000;
        for(int i=0; i < 5000; i++) {
            arr[i] = valor;
            valor--;
        }
        
        Integer arr2[] = arr.clone();
        Integer arr3[] = arr.clone();

        BubbleSortSorterImple<Integer> bMatrizSorter = (BubbleSortSorterImple<Integer>) MyFactory.getInstance("sorterBubble");
        Time.start();
        bMatrizSorter.sort(arr, null);
        Time.stop();
        System.out.println("Bubble = " + Time.elapsedTime());

        QuickSortSorterImple<Integer> qMatrizSorter = (QuickSortSorterImple<Integer>) MyFactory.getInstance("sorterQuick");

        Time.start();
        qMatrizSorter.sort(arr2, null);
        Time.stop();
        System.out.println("Quick = " +Time.elapsedTime());

        HeapSortSorterImple<Integer> hMatrizSorter = (HeapSortSorterImple<Integer>) MyFactory.getInstance("sorterHeap");

        Time.start();
        hMatrizSorter.sort(arr3, null);
        Time.stop();
        System.out.println( "Heap = " +Time.elapsedTime());
    }    
}
