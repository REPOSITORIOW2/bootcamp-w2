package com.bootcamp.tm.exercicio1;

import com.bootcamp.tm.exercicio1.sorter.BubbleSortSorterImple;
import com.bootcamp.tm.exercicio1.sorter.HeapSortSorterImple;
import com.bootcamp.tm.exercicio1.sorter.QuickSortSorterImple;
import com.bootcamp.tm.exercicio1.sorter.Sorter;

import java.util.Comparator;
import java.util.Random;

public class Exercicio1 {

    public static void main(String[] args) {
        testGenericSort();
        testQuickSort();
        testHeapSort();
        testBubbleSort();
    }

    private static Integer[] generateIntegerList(int elements) {
        Integer[] items = new Integer[elements];

        Random random = new Random();
        for(int i = 0; i < elements; i++) {
            items[i] = random.nextInt(elements * 2);
        }

        return items;
    }

    private static void testGenericSort() {
        Sorter sorter = MyFactory.getInstance();

        Integer[] arr = generateIntegerList(5000);

        Time time = new Time();
        time.start();
        sorter.sort(arr, Comparator.naturalOrder());
        time.stop();
        System.out.println("Generic sort ("+sorter.getClass().getSimpleName()+"): Ordenado em " + time.getElapsedTimeInMilliseconds() + "ms");
    }

    private static void testQuickSort() {
        Sorter<Integer> sorter = new QuickSortSorterImple();

        Integer[] items = generateIntegerList(5000);

        sorter.sort(items, Comparator.naturalOrder());
        Time time = new Time();
        time.start();
        sorter.sort(items, Comparator.naturalOrder());
        time.stop();
        System.out.println(sorter.getClass().getSimpleName() + ": Ordenado em " + time.getElapsedTimeInMilliseconds() + "ms");
    }

    public static void testHeapSort() {
        Sorter<Integer> sorter = new HeapSortSorterImple();

        Integer[] items = generateIntegerList(5000);

        sorter.sort(items, Comparator.naturalOrder());
        Time time = new Time();
        time.start();
        sorter.sort(items, Comparator.naturalOrder());
        time.stop();
        System.out.println(sorter.getClass().getSimpleName() + ": Ordenado em " + time.getElapsedTimeInMilliseconds() + "ms");
    }

    public static void testBubbleSort() {
        Sorter<Integer> sorter = new BubbleSortSorterImple();

        Integer[] items = generateIntegerList(5000);

        sorter.sort(items, Comparator.naturalOrder());
        Time time = new Time();
        time.start();
        sorter.sort(items, Comparator.naturalOrder());
        time.stop();
        System.out.println(sorter.getClass().getSimpleName() + ": Ordenado em " + time.getElapsedTimeInMilliseconds() + "ms");
    }

}
