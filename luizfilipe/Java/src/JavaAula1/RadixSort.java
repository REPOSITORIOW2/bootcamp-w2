package JavaAula1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RadixSort {


    private static void radixSort(int[] iArr) {
        int maxDigits = 0;
        var sArray = new String[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            var stringValue = String.valueOf(iArr[i]);
            sArray[i] = stringValue;
            if (stringValue.length() > maxDigits) {
                maxDigits = stringValue.length();
            }
        }
        // Fill with zeros to the left
        for (int i = 0; i < sArray.length; i++) {
            sArray[i] = fillZeros(sArray[i], maxDigits);
        }

        // Create the temp lists, one for each digit 0-9
        var tempLists = IntStream.range(0, 10)
                .mapToObj(ignore -> new ArrayList<String>())
                .collect(Collectors.toList());


        // Temp list that stores the result
        var result = Arrays.asList(sArray);

        // Running the sort for each digit position of the string
        for (int i = maxDigits - 1; i >= 0; i--) {
            // Insert the string to the proper bucket
            for (String element : result) {
                int index = Integer.parseInt(String.valueOf(element.charAt(i)));
                tempLists.get(index).add(element);
            }
            // Clear the old result so we can insert the new one
            result.clear();

            // Loop through all buckets, the first interaction will be 0 and the last one 9
            for (var tempList : tempLists) {
                result.addAll(tempList);
            }

            // Clear all the temp lists, so we don't need to create new ones
            tempLists.forEach(ArrayList::clear);
        }

        // Set the result on the parameter array
        for (int i = 0; i < result.size(); i++) {
            iArr[i] = Integer.parseInt(result.get(i));
        }
    }

    private static String fillZeros(String str, int targetLength) {
        int neededZeros = targetLength - str.length();
        if (neededZeros == 0) {
            return str;
        }
        // Java 11 nice
        return "0".repeat(neededZeros) + str;
    }


    public static void main(String[] args) {

        int[] iArr = {22, 15, 1};

        radixSort(iArr);

        for (int i : iArr) {
            System.out.print(i + " ");
        }
    }
}
