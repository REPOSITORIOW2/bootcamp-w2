package com.company;

import java.util.*;

public class Main {

    // pega o maior valor do array
    static int getMax(int arr[], int n)
    {
        int mx = arr[0];
        for (int i = 1; i < n; i++)
            if (arr[i] > mx)
                mx = arr[i];
        return mx;
    }

    // função que ordena o array de acordo com o digito representado por exp
    static void countSort(int arr[], int n, int exp)
    {
        int output[] = new int[n]; // array de retorno
        int i;
        int count[] = new int[10];
        Arrays.fill(count, 0);

        // Conta as ocorrencias em count[]
        for (i = 0; i < n; i++)
            count[(arr[i] / exp) % 10]++;

        // Muda count[i] Para que count[i] tenha a
        // a posição atual deste digito em output[]
        for (i = 1; i < 10; i++)
            count[i] += count[i - 1];

        // monta o array de retorno
        for (i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }

        // copia o array de retorno para arr[],para que arr[]
        // tenha os numeros ordenados de acordo com o respectivo digito
        for (i = 0; i < n; i++)
            arr[i] = output[i];


    }

    static void radixSort(int arr[], int n)
    {
        // encontra maior numero
        int m = getMax(arr, n);

        // faz a ordenação para cada digito utilizando a potencia de 10.
        // Ex.: 1 digito = 1, 2 digito = 10, 3 digito = 100, etc.
        for (int exp = 1; m / exp > 0; exp *= 10)
            countSort(arr, n, exp);

    }


    public static void main(String[] args)
    {
        int arr[] = {16223, 898, 13, 906, 235, 23, 9, 1532, 6388, 2511, 8};
        int n = arr.length;

        radixSort(arr, n);

        Arrays.stream(arr).forEach((x) -> System.out.println(x));

    }


}
