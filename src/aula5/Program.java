package aula5;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;

public class Program {
    public static void main(String[] args) {
        Timer t = new Timer();

        Integer[] arr1 = {90,23,101,45,65,23,67,89,34,23};
        String[] arr2 = {"Maurício", "Ângelo", "João", "Amanda", "Adriana"};

        Sorter<Integer> qs = (Sorter<Integer>) MyFactory.getInstance("Teste");
        qs.sort(arr1, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });

        for(int i : arr1) {
            System.out.println(i);
        }

        Sorter<String> qsStr = (Sorter<String>) MyFactory.getInstance("Teste");
        qsStr.sort(arr2,  String::compareTo);

        for(String s : arr2) {
            System.out.println(s);
        }

        // teste da implementação com a matriz
        gerarMatriz("src/aula5/input.txt");
        Integer[] valores = lerMatriz("src/aula5/input.txt");

        Sorter<Integer> matriz = (Sorter<Integer>) MyFactory.getInstance("Teste");

        t.start();
        matriz.sort(valores, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        t.stop();

        long duracao = t.elapsedTime();
        System.out.println(duracao + "ms");
    }

    public static void gerarMatriz(String filename) {
        int contador = 5000;
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(filename));

            for (int i = 1; i <= 5000; i++) {
                bw.write(contador-- + ",");
                if(i % 5 == 0) {
                    bw.newLine();
                }
            }
            bw.flush();
        } catch (IOException e) {
            System.out.println("Erro ao gerar arquivo");
        }
    }

    public static Integer[] lerMatriz(String filename) {
        Integer[] res = new Integer[5000];

        try {
            String content = Files.readString(Path.of(filename));

            String[] arr = content.replaceAll("\n", "").split(",");

            for(int i = 0; i < arr.length; i++) {
                res[i] = Integer.parseInt(arr[i]);
            }

            return res;
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo");
            return res;
        }
    }
}
