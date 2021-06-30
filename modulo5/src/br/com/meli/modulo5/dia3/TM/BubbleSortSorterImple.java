package br.com.meli.modulo5.dia3.TM;

import java.util.Comparator;

public class BubbleSortSorterImple implements Sorter{

    @Override
    public void sort(Object[] arr, Comparator c) {

        System.out.println("Bubble");
        bubbleSort(arr, c);
    }

    void bubbleSort(Object arr[],Comparator c)
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (c.compare(arr[j], arr[j+1]) > 0)
                {
                    Object temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }


}
