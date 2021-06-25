package JavaAula1;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Q6b{
    public static void main(String[] args) {

        int[] array = {52, 10, 85, 1324, 01, 13, 62, 30, 12, 127};

        int[] sorted = IntStream.of(array).sorted().toArray();

        for (int i = sorted.length -1; i >= 0; i--) {
            System.out.println(sorted[i]);
        }
    }

}