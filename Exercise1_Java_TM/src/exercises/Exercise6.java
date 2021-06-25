package exercises;

import static java.lang.System.*;
import java.util.Arrays;

public class Exercise6 {
    Integer[] array = {52, 10, 85, 1324, 01, 13, 62, 30, 12, 127};

    private void up(Integer[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i+1]) {
                int var = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = var;

                this.up(arr);
            }
        }
    }

    private void reverse(Integer[] arr) {
        for(int i = 0; i < arr.length / 2; i++)  {
            int tempValue = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = tempValue;
        }
    }

    public void exec() {
        Integer[] arrayClone = array.clone();

        this.up(arrayClone);
        out.println("Ordenado crescente: " + Arrays.toString(arrayClone));

        this.reverse(arrayClone);
        out.println("Ordenado decrescente: " + Arrays.toString(arrayClone));
    }
}
