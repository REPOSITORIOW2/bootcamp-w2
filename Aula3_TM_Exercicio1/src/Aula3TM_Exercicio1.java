import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Timer;

public class Aula3TM_Exercicio1 {
    public static void main(String[] args) {
        String[] arrayOfStrings = {"Andree", "Leana", "Faviola", "Loyce", "Quincy", "Milo", "Jamila", "Toccara", "Nelda", "Blair", "Ernestine", "Chara", "Kareen", "Monty", "Rene", "Cami", "Winifred", "Tara", "Demetrice", "Azucena"};
        Double[] arrayOfDoubles = {0.35, 0.02, 0.36, 0.82, 0.27, 0.49, 0.41, 0.17, 0.30, 0.89, 0.37, 0.66, 0.82, 0.17, 0.20, 0.96, 0.18, 0.25, 0.37, 0.52};

        try {
            Time timer = new Time();

            Sorter<String> stringSorter = (Sorter) MyFactory.getInstance("");
            Sorter<Double> doubleSorter = (Sorter) MyFactory.getInstance("");

            InputStream inputStream = new FileInputStream("src/numbers.txt");


            System.out.println("Classe de ordenacao: " + stringSorter.getClass());

            timer.start();

            stringSorter.sort(arrayOfStrings, Comparator.comparing(String::toString));
            System.out.println(Arrays.toString(arrayOfStrings));

            doubleSorter.sort(arrayOfDoubles, Comparator.comparingDouble(Double::doubleValue));
            System.out.println(Arrays.toString(arrayOfDoubles));

            timer.stop();

            System.out.println(timer.elapsedTime() + " Milliseconds");
        } catch (IOException err) {
            System.out.println("Erro: " + err.getMessage());
        }
    }
}
