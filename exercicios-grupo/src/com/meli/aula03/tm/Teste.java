package com.meli.aula03.tm;

import java.util.Arrays;
import java.util.Comparator;

public class Teste {

    public static Integer[] generateArray(int n) {
        Integer[] arr = new Integer[n];
        int i = 0;
        while (i < n) {
            arr[i] = n - i;
            i++;
        }
        return arr;
    }
    public static void main(String[] args) {

        Sorter a = (Sorter) MyFactory.getInstance("Objeto");

        Comparator c = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((Integer) o1).compareTo((Integer) o2);
            }
        };

        Integer[] b = generateArray(5);

        assert a != null;
        Arrays.stream(b).forEach(System.out::print);

        Time tempo = new Time();
        tempo.start();
        a.sort(b, c);
        tempo.stop();
        tempo.elapsedTime();

        System.out.println("\n\n");

        Arrays.stream(b).forEach(System.out::print);

    }
}
