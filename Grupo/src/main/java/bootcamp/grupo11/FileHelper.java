package bootcamp.grupo11;

import java.io.*;
import java.util.Scanner;


public class FileHelper {

    private static final int SIZE = 10000;
    public static void generateInicialFil() {
        try {
            File fout = new File("array.txt");
            FileOutputStream fos = new FileOutputStream(fout);

            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));

            for (int i = SIZE; i >= 1; i--) {
                bw.write(String.valueOf(i));
                bw.newLine();
            }

            bw.close();
        } catch (Exception e) {

        }
    }

    public static Integer[] vetorFromFile() {
        try {
            Integer[] vetorResult = new Integer[SIZE];
            File myObj = new File("array.txt");
            Scanner myReader = new Scanner(myObj);
            for(int i= 0; i< SIZE; i ++){
                String data = myReader.nextLine();
                vetorResult[i] = Integer.parseInt(data);
            }
            return vetorResult;
        } catch (Exception e) {
            return null;
        }
    }

    public static void writeToFile(int[] Array) {
        try {
            FileWriter fw = new FileWriter("array.txt", false);
            BufferedWriter bw = new BufferedWriter(fw);
            for (int i = 0; i <= Array.length - 1; i++) {

                bw.write(Array[i]);
                bw.newLine();
            }
            bw.close();
        } catch (Exception e) {

        }
    }
}