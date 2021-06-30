package com.mercadolivre;

import java.util.*;

public class RadixSort {

    private static void radixSort(int[] array){
        List<String> numbers = createStringList(array);

        int maxDigitCount = findMaxDigitCount(numbers);
        padLeftAllNumbers(numbers, maxDigitCount);

        List<Queue<String>> container = buildInitialContainer();

        for(int i = maxDigitCount - 1; i >= 0; i--){
            fillContainer(i, container, numbers);
            flattenContainer(numbers, container);
        }

        fillIntArray(array, numbers);
    }

    private static void fillIntArray(int[] array, List<String> numbers) {
        for(int i = 0; i < numbers.size(); i++){
            array[i] = Integer.parseInt(numbers.get(i));
        }
    }

    private static List<Queue<String>> buildInitialContainer() {
        List<Queue<String>> container = new ArrayList<>();
        for(int i = 0 ; i < 10; i++){
            container.add(new LinkedList<>());
        }
        return container;
    }

    private static void flattenContainer(List<String> numbers, List<Queue<String>> container) {
        numbers.clear();
        for(Queue<String> queue : container){
            while(!queue.isEmpty()){
                String number = queue.remove();
                numbers.add(number);
            }
        }
    }

    private static void fillContainer(int position, List<Queue<String>> container, List<String> numbers) {
        for(String number : numbers){
            Character c = number.charAt(position);
            Integer containerIndex = c - '0';
            container.get(containerIndex).add(number);
        }
    }

    private static void padLeftAllNumbers(List<String> numbers, int maxDigitCount) {
        for(int i = 0; i < numbers.size(); i++){
            String paddedNumber = padLeft(numbers.get(i), maxDigitCount);
            numbers.set(i, paddedNumber);
        }
    }

    private static String padLeft(String number, int length){
        return length > number.length() ? padLeft("0" + number, length) : number;
    }

    private static int findMaxDigitCount(List<String> numbers) {
        int maxDigitCount = 0;
        for(String number : numbers){
            maxDigitCount = (number.length() > maxDigitCount) ? number.length() : maxDigitCount;
        }
        return maxDigitCount;
    }

    private static List<String> createStringList(int[] array) {
        List<String> numbers = new ArrayList<>();
        for(int x : array){
            numbers.add(Integer.toString(x));
        }
        return numbers;
    }

    public static void main(String[] args) {
        int array[] = { 16223, 898, 13, 906, 235, 23, 9, 1532, 6388, 2511, 8 };

        System.out.println("Before sort:\n" + Arrays.toString(array));

        radixSort(array);

        System.out.println("After sort:\n" + Arrays.toString(array));
    }
}
