import java.io.*;
import java.util.*;

public class Program {
    public static void main(String[] args) {
        try {
            Time timer = new Time();

            Sorter<Integer> sorter = (Sorter<Integer>) MyFactory.getInstance("");

            System.out.println("Classe de ordenacao: " + sorter.getClass());

            Integer[] testArray = readFile();

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

    private static Integer[] readFile() {
        List<Integer> integers = new ArrayList<>();
        Scanner scanner = null;

        try {
            File file = new File("src/numbers.txt");
            scanner = new Scanner(file);

            while (scanner.hasNext()) {
                String[] line = scanner.nextLine().split(",");

                for (String num: line)
                    integers.add(Integer.parseInt(num));
            }
        } catch (FileNotFoundException err) {
            System.out.println("Erro ao ler arquivo: " + err.getMessage());
        } finally {
            scanner.close();
        }

        return integers.stream().mapToInt(Integer::intValue).boxed().toArray(Integer[]::new);
    }
}
