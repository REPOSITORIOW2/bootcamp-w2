package aula3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RadixSort {
    public static void radixSort(int[] arr) {
        String[] sArr = new String[arr.length];
        int maxLenght = 0;

        // passo 3 - criando 10 listas
        HashMap<Integer, List<String>> map = new HashMap<>();
        map.put(0, new ArrayList<>());
        map.put(1, new ArrayList<>());
        map.put(2, new ArrayList<>());
        map.put(3, new ArrayList<>());
        map.put(4, new ArrayList<>());
        map.put(5, new ArrayList<>());
        map.put(6, new ArrayList<>());
        map.put(7, new ArrayList<>());
        map.put(8, new ArrayList<>());
        map.put(9, new ArrayList<>());

        // passo 1 - converter o array de int para string
        for(int i = 0; i < arr.length; i++) {
            sArr[i] = String.valueOf(arr[i]);

            if(maxLenght < sArr[i].length()) {
                maxLenght = sArr[i].length();
            }
        }

        // passo 2 - fazendo com que todos os números tenham o mesmo tamanho
        for(int i = 0; i < sArr.length; i++) {
            int zerosToAdd = maxLenght - sArr[i].length();
            for(int j = 0; j < zerosToAdd; j++) {
                sArr[i] = "0" + sArr[i];
            }
        }

        int count = 1;

        while(count <= maxLenght) {
            // popula as listas correspondentes a cada digito em determinada posição
            for(String number : sArr) {
                int pos = Character.getNumericValue(number.charAt(maxLenght - count));
                List<String> list = map.get(pos);
                list.add(number);
            }

            int lastPosOverride = 0;

            // percorremos o map de listas
            for(Map.Entry<Integer, List<String>> m : map.entrySet()) {
                List<String> l = m.getValue();
                int key = m.getKey();

                // para cada item da lista, sobrescrevemos o array de strings
                for(String number : l) {
                    sArr[lastPosOverride] = number;
                    lastPosOverride++;
                }

                // passamos uma nova referência de lista para a chave
                l.clear();
            }

            count++;
        }

        // converter array de string para int - mexendo no mesmo endereço
        for(int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(sArr[i]);
        }
    }

    public static void main(String[] args) {
        int[] iArr = {16223, 898, 13, 906, 235, 23, 9, 1532, 6388, 2511, 8};

        radixSort(iArr);

        for(int i : iArr) {
            System.out.print(i + " ");
        }
    }
}
