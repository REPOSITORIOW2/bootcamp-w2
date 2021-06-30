package br.com.meli.modulo5.dia3.TM;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Object[] arr = new Integer[5000];

        Random range = new Random();
        for (int i = 0;i<5000;i++){
            arr[i] = range.nextInt(100000);
        }

        Sorter q = (Sorter) MyFactory.getInstance();


        Timer t = new Timer();
        t.setStart();

        q.sort(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {

                return ((Integer) o1).compareTo(((Integer) o2));

            }});

        t.setEnd();

        System.out.println(t.getElapsedTime() + " s" );

        System.out.println(Arrays.toString(arr));


    }
}
