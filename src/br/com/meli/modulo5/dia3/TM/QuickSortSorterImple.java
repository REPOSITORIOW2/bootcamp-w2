package br.com.meli.modulo5.dia3.TM;

import java.util.Comparator;

public class QuickSortSorterImple implements Sorter{

    @Override
    public void sort(Object[] arr, Comparator c) {

        System.out.println("Quick");
        quickSort(arr,0,arr.length-1,c);

    }

    public void quickSort(Object arr[], int begin, int end, Comparator c) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end,c);
            quickSort(arr, begin, partitionIndex-1,c);
            quickSort(arr, partitionIndex+1, end,c);
        }
    }

    private int partition(Object arr[], int begin, int end, Comparator c) {
        Object pivot = arr[end];
        int i = (begin-1);
        for (int j = begin; j < end; j++) {
            if (c.compare(arr[j],pivot)>=0) {
                i++;
                Object swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }
        Object swapTemp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = swapTemp;
        return i+1;
    }


}
