import java.io.*;
import java.util.*;

public class Aula3TM_Exercicio1 {
    public static void main(String[] args) {
//        String[] arrayOfStrings = {"Andree", "Leana", "Faviola", "Loyce", "Quincy", "Milo", "Jamila", "Toccara", "Nelda", "Blair", "Ernestine", "Chara", "Kareen", "Monty", "Rene", "Cami", "Winifred", "Tara", "Demetrice", "Azucena"};
//        Double[] arrayOfDoubles = {0.35, 0.02, 0.36, 0.82, 0.27, 0.49, 0.41, 0.17, 0.30, 0.89, 0.37, 0.66, 0.82, 0.17, 0.20, 0.96, 0.18, 0.25, 0.37, 0.52};

        readFile();

        try {
            Time timer = new Time();

            Sorter<Integer> sorter = (Sorter<Integer>) MyFactory.getInstance("");

            System.out.println("Classe de ordenacao: " + sorter.getClass());

            List<Integer> testList = readFile();
            Integer[] testArray = testList.toArray(new Integer[testList.size()]);

            System.out.println("Antes da ordenacao: " + Arrays.toString(testArray));

            timer.start();

            sorter.sort(testArray, Comparator.comparing(Integer::intValue));

            timer.stop();

            System.out.println("Depois da ordenacao: " + Arrays.toString(testArray));

            System.out.println("Tempo decorrido: " + timer.elapsedTime() + " Milliseconds");
        } catch (IOException err) {
            System.out.println("Erro: " + err.getMessage());
        }
    }

    private static List<Integer> readFile() {
        List<Integer> integers = new ArrayList<>();

        try {
            File file = new File("src/numbers.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()) {
                String[] line = scanner.nextLine().split(",");

                for (String num: line)
                    integers.add(Integer.parseInt(num));
            }
        } catch (FileNotFoundException err) {
            System.out.println("Erro: " + err.getMessage());
        }

        return integers;
    }
}
