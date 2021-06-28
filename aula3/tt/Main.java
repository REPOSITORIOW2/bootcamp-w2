package poo.aula3.tt;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {

        var timer = new Timer();

        Integer[] arr = new Integer[5000];

        int j = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            arr[j] = i;
            j++;
        }

        timer.start();
        Sorter<Integer> sorter = (Sorter<Integer>) MyFactory.getInstance("oi");
        sorter.sort(arr, Integer::compare);
        Arrays.stream(arr).forEach(System.out::println);
        timer.stop();
        System.out.println("Elapsed time: " + timer.elapsedTime());




//        Sorter<String> sorter2 = (Sorter<String>) MyFactory.getInstance("oi");
//        String[] arr2 = {"oi", "oii", "o", "aa", "a"};
//
//        sorter2.sort(arr2, CharSequence::compare);
//        Arrays.stream(arr2).forEach(System.out::println);


    }
}
