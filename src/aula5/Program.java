package aula5;

import java.util.Comparator;

public class Program {
    public static void main(String[] args) {
        Integer[] arr1 = {90,23,101,45,65,23,67,89,34,23};
        String[] arr2 = {"Maurício", "Ângelo", "João", "Amanda", "Adriana"};

        Sorter<Integer> qs = (Sorter<Integer>) MyFactory.getInstance("Teste");
        qs.sort(arr1, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });

        for(int i : arr1) {
            System.out.println(i);
        }

        Sorter<String> qsStr = (Sorter<String>) MyFactory.getInstance("Teste");
        qsStr.sort(arr2,  String::compareTo);

        for(String s : arr2) {
            System.out.println(s);
        }
    }
}
