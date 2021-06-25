import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RadixSort {
    public static void radixSort(int[] iArr){
        String sArr[] = new String[iArr.length];
        List l0 = new ArrayList();
        List l1 = new ArrayList();
        List l2 = new ArrayList();
        List l3 = new ArrayList();
        List l4 = new ArrayList();
        List l5 = new ArrayList();
        List l6 = new ArrayList();
        List l7 = new ArrayList();
        List l8 = new ArrayList();
        List l9 = new ArrayList();

        for (int i = 0; i < iArr.length; i++) {
            if(String.valueOf(iArr[i]).charAt(String.valueOf(iArr[i]).length()-1) == 0){
                l0.add(String.valueOf(iArr[i]));
            }
            if(String.valueOf(iArr[i]).charAt(String.valueOf(iArr[i]).length()-1) == 1){
                l1.add(String.valueOf(iArr[i]));
            }
            if(String.valueOf(iArr[i]).charAt(String.valueOf(iArr[i]).length()-1) == 2){
                l2.add(String.valueOf(iArr[i]));
            }
            if(String.valueOf(iArr[i]).charAt(String.valueOf(iArr[i]).length()-1) == 3){
                l3.add(String.valueOf(iArr[i]));
            }
            if(String.valueOf(iArr[i]).charAt(String.valueOf(iArr[i]).length()-1) == 4){
                l4.add(String.valueOf(iArr[i]));
            }
            if(String.valueOf(iArr[i]).charAt(String.valueOf(iArr[i]).length()-1) == 5){
                l5.add(String.valueOf(iArr[i]));
            }
            if(String.valueOf(iArr[i]).charAt(String.valueOf(iArr[i]).length()-1) == 6){
                l6.add(String.valueOf(iArr[i]));
            }
            if(String.valueOf(iArr[i]).charAt(String.valueOf(iArr[i]).length()-1) == 7){
                l7.add(String.valueOf(iArr[i]));
            }
            if(String.valueOf(iArr[i]).charAt(String.valueOf(iArr[i]).length()-1) == 8){
                l8.add(String.valueOf(iArr[i]));
            }
            if(String.valueOf(iArr[i]).charAt(String.valueOf(iArr[i]).length()-1) == 9){
                l9.add(String.valueOf(iArr[i]));
            }
        }
    }

    public static void main(String[] args){
        int iArr[] = { 16223, 898, 13, 906, 235, 23, 9, 1532, 6388, 2511,8};

        radixSort(iArr);


        for (int i : iArr){
            System.out.println(i + " ");
        }
    }


}
