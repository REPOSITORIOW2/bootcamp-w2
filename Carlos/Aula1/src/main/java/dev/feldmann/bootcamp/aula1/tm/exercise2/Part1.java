package dev.feldmann.bootcamp.aula1.tm.exercise2;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Part1 {

    public static void main(String[] args) {

        int[] array = {54, 10, 85, 1234, 1, 13, 62, 30, 12, 127};

        int[] sorted = IntStream.of(array).sorted().toArray();

        System.out.println("Asc: "+Arrays.toString(sorted));

        System.out.print("Desc: [");
        for (int i = sorted.length - 1; i >= 0; i--) {
            System.out.print(sorted[i]);
            if (i != 0)
                System.out.print(", ");
        }
        System.out.print("]");

    }


}
