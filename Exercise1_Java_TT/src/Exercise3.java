import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise3 {
    public static void addDigitsToList(List<String> auxList, List<String> primaryList) {
        for (String s: primaryList)
            auxList.add(s);
    }

    public static void radixSort(int iArr[]) {
        String[] sArr = new String[iArr.length];
        int maxSize = String.valueOf(Arrays.stream(iArr).max().getAsInt()).length();

        for (int i = 0; i < iArr.length; i++)
            sArr[i] = String.format("%0" + maxSize + "d", iArr[i]);

        List<String> list0, list1, list2, list3, list4, list5, list6, list7, list8, list9, auxList;

        list0 = new ArrayList<>();
        list1 = new ArrayList<>();
        list2 = new ArrayList<>();
        list3 = new ArrayList<>();
        list4 = new ArrayList<>();
        list5 = new ArrayList<>();
        list6 = new ArrayList<>();
        list7 = new ArrayList<>();
        list8 = new ArrayList<>();
        list9 = new ArrayList<>();
        auxList = new ArrayList<>();

        for (String s: sArr)
            auxList.add(s);

        for(int i = maxSize-1; i >= 0; i--) {
            for (String s: auxList) {
                char category = s.charAt(i);

                switch (category) {
                    case '0':
                        list0.add(s);
                        break;
                    case '1':
                        list1.add(s);
                        break;
                    case '2':
                        list2.add(s);
                        break;
                    case '3':
                        list3.add(s);
                        break;
                    case '4':
                        list4.add(s);
                        break;
                    case '5':
                        list5.add(s);
                        break;
                    case '6':
                        list6.add(s);
                        break;
                    case '7':
                        list7.add(s);
                        break;
                    case '8':
                        list8.add(s);
                        break;
                    case '9':
                        list9.add(s);
                        break;
                }
            }

            auxList.clear();

            addDigitsToList(auxList, list0);
            addDigitsToList(auxList, list1);
            addDigitsToList(auxList, list2);
            addDigitsToList(auxList, list3);
            addDigitsToList(auxList, list4);
            addDigitsToList(auxList, list5);
            addDigitsToList(auxList, list6);
            addDigitsToList(auxList, list7);
            addDigitsToList(auxList, list8);
            addDigitsToList(auxList, list9);

            list0.clear();
            list1.clear();
            list2.clear();
            list3.clear();
            list4.clear();
            list5.clear();
            list6.clear();
            list7.clear();
            list8.clear();
            list9.clear();
        }

        for (int i = 0; i < iArr.length; i++)
            iArr[i] = Integer.valueOf(auxList.get(i));
    }

    public static void main(String[] args) {
        int[] iArr = {16233, 898, 13, 906, 235, 23, 9, 1532, 6388, 2511, 8};

        radixSort(iArr);

        for (int i: iArr)
            System.out.print(i + " ");
    }
}
