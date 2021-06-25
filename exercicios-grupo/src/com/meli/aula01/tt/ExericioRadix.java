package com.meli.aula01.tt;

import javax.lang.model.element.QualifiedNameable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;

public class ExericioRadix {

    public static void radixSort(int[] vector){
        int maiorNumeroInt = max(vector);
        for(int digit = 0; digit < maiorNumeroInt; digit ++){
            int power = (int) Math.pow(10, digit+1);
            int z[][] = new int[vector.length][10];
            int n[] = new int[10];
            for(int i = 0; i < vector.length; i ++){
                int num = vector[i];
                z[n[(num%power)/(power/10)]][(num%power)/(power/10)] = num;
                n[(num%power)/(power/10)]++;
            }
            int c = 0;
            for(int i = 0; i < 10; i ++){
                for(int j = 0; j < vector.length; j ++){
                    if(j < n[i]){
                        vector[c] = z[j][i];
                        c++;
                    }else{break;}
                }
            }
        }
    }


    public static int max(int[] t) {
        int maximum = t[0];
        for (int i=1; i<t.length; i++) {
            if (t[i] > maximum) {
                maximum = t[i];
            }
        }
        return maximum;
    }

    public static void radixString(int iArr[]) {
        int maiorNumeroInt = max(iArr);
        String maiorNumero = String.valueOf(maiorNumeroInt);
        int quantidadeDigitos = maiorNumero.length();
        List<String> sArr = new ArrayList<>();

        for (int i = 0; i < iArr.length; i++) {
            sArr.add(String.format("%0" + quantidadeDigitos + "d", iArr[i]));
        }

        for (String c: sArr) {
            var valor = c.substring(c.length() - 1);
            if (valor.equals("0")) {

            }
        }

    }

    public static void main(String[] args) {


        int[] iArr = { 16223, 898, 13, 903, 235, 23, 9, 1532, 6388, 2511, 8};

        radixSort(iArr);

        for (int i : iArr){
            System.out.println(i + " ");
        }

        // radixString(iArr);
    }
}
