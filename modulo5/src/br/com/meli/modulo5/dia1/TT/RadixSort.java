package br.com.meli.modulo5.dia1.TT;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RadixSort {
    public static void radixSort(Integer iArr[]){
        List<Integer> lArr =  Arrays.asList(iArr);


        int max = Collections.max(lArr).toString().length();
        //Integer max = Integer.toString(Collections.max(lArr)).length();

//        String[] sArr = new String[iArr.length];
        List<String> sArr = new ArrayList<>();
        for(int value : lArr){
            String valueString = String.valueOf(value);
            while(valueString.length() < max){
                valueString = "0"+valueString;
            }
        sArr.add(valueString);
        }




            for(int i =max-1; i>=0;i--){
                List<String>  L0 = new ArrayList<>();
                List<String>  L1 = new ArrayList<>();
                List<String>  L2 = new ArrayList<>();
                List<String>  L3 = new ArrayList<>();
                List<String>  L4 = new ArrayList<>();
                List<String>  L5 = new ArrayList<>();
                List<String>  L6 = new ArrayList<>();
                List<String>  L7 = new ArrayList<>();
                List<String>  L8 = new ArrayList<>();
                List<String>  L9 = new ArrayList<>();
                for(String item : sArr){
                    switch (item.charAt(i)){
                        case '0':
                            L0.add(item);
                            break;
                        case '1':
                            L1.add(item);
                            break;
                        case '2':
                            L2.add(item);
                            break;
                        case '3':
                            L3.add(item);
                            break;
                        case '4':
                            L4.add(item);
                            break;
                        case '5':
                            L5.add(item);
                            break;
                        case '6':
                            L6.add(item);
                            break;
                        case'7':
                            L7.add(item);
                            break;
                        case '8':
                            L8.add(item);
                            break;
                        case '9':
                            L9.add(item);
                            break;
                        default:
                            break;
                    }
                }
                sArr = new ArrayList<>();
                sArr.addAll(L0);
                sArr.addAll(L1);
                sArr.addAll(L2);
                sArr.addAll(L3);
                sArr.addAll(L4);
                sArr.addAll(L5);
                sArr.addAll(L6);
                sArr.addAll(L7);
                sArr.addAll(L8);
                sArr.addAll(L9);

            }



        for(int i = 0; i<sArr.size();i++){
            iArr[i]= Integer.parseInt(sArr.get(i));
        }





    }

    public static void main(String[] args) {
        Integer iArr[] = {16223, 898, 13, 906, 235,23, 9, 1532, 6388, 2511, 8};
        radixSort(iArr);
        for (int i: iArr){
            System.out.println(i +"");
        }


    }
}
