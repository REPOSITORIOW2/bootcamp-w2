import java.util.Comparator;

public class Aula3TM_Exercicio1 {
    public static void main(String[] args) {
        String[] arrayOfStrings = {"Andree", "Leana", "Faviola", "Loyce", "Quincy", "Milo", "Jamila", "Toccara", "Nelda", "Blair", "Ernestine", "Chara", "Kareen", "Monty", "Rene", "Cami", "Winifred", "Tara", "Demetrice", "Azucena"};
        Double[] arrayOfDoubles = {0.35, 0.02, 0.36, 0.82, 0.27, 0.49, 0.41, 0.17, 0.30, 0.89, 0.37, 0.66, 0.82, 0.17, 0.20, 0.96, 0.18, 0.25, 0.37, 0.52};

//        System.out.println("-------------- QuickSort --------------");
//        QuickSortSorterImple<String> stringSorter = new QuickSortSorterImple<>();
//        stringSorter.sort(arrayOfStrings, Comparator.comparing(String::toString));
//        System.out.println(java.util.Arrays.toString(arrayOfStrings));
//
//        QuickSortSorterImple<Double> doubleSorter = new QuickSortSorterImple<>();
//        doubleSorter.sort(arrayOfDoubles, Comparator.comparingDouble(Double::doubleValue));
//        System.out.println(java.util.Arrays.toString(arrayOfDoubles));

//        System.out.println("-------------- HeapSort --------------");
//        HeapSortSorterImple<String> stringHeapSorter = new HeapSortSorterImple<>();
//        stringHeapSorter.sort(arrayOfStrings, Comparator.comparing(String::toString));
//        System.out.println(java.util.Arrays.toString(arrayOfStrings));
//
//        HeapSortSorterImple<Double> doubleHeapSorter = new HeapSortSorterImple<>();
//        doubleHeapSorter.sort(arrayOfDoubles, Comparator.comparingDouble(Double::doubleValue));
//        System.out.println(java.util.Arrays.toString(arrayOfDoubles));

        System.out.println("-------------- BubbleSort --------------");
        BubbleSortSorterImple<String> stringBubbleSorter = new BubbleSortSorterImple<>();
        stringBubbleSorter.sort(arrayOfStrings, Comparator.comparing(String::toString));
        System.out.println(java.util.Arrays.toString(arrayOfStrings));

        BubbleSortSorterImple<Double> doubleBubbleSorter = new BubbleSortSorterImple<>();
        doubleBubbleSorter.sort(arrayOfDoubles, Comparator.comparingDouble(Double::doubleValue));
        System.out.println(java.util.Arrays.toString(arrayOfDoubles));
    }
}
