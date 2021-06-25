package JavaAula1;
public class RadixSort {
    public static void radixSort(int[] iArr) {

        iteration = 1;
        Integer maxValue =  0;

        for (int i : iArr) {
            if (i > maxValue) {
                maxValue = i;
            }
        }

        int iterations = Integer.toString(maxValue).length();
        int countMax = 0;

        while (countMax <= iterations) {
            for (int i : iArr) {
                i
            }
        }


    }
    public static void main(String[] args) {

        int[] iArr = {16223, 898, 13, 906, 235, 23, 9, 1532, 6388, 2511, 8};

        radixSort(iArr);

        for (int i : iArr) {
            System.out.println(i + " ");
        }
        
    }
}
