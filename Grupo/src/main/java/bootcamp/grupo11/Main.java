package bootcamp.grupo11;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        testSorters();
        testTimes();
    }

    private static void testTimes() {
        Timer timer = new Timer();
        timer.start();
        FileHelper.generateInicialFil();
        //Chama o sort xD
        Integer[] intArray = FileHelper.vetorFromFile();
        Sorter<Integer> intSorter = MyFactory.getInstance(Integer.class);
        intSorter.sort(intArray, Integer::compareTo);
        timer.stop();
        var duracao = timer.elapsedTime();
        System.out.println(String.format("Demorou %dms com o sorter %s", duracao, intSorter.getClass().getSimpleName()));

        System.out.println(Arrays.toString(intArray));

    }

    private static void testSorters() {
        Sorter<String> stringSorter = MyFactory.getInstance(String.class);
        Sorter<Integer> intSorter = MyFactory.getInstance(Integer.class);

        // Precisamos verificar se é null, pois se não acharmos a classe do sorters, ou não for uma instancia de sorter,
        // vai retornar null
        if (intSorter != null) {
            Integer[] intArray = {23, 44, 55, 28, 200, 1, 20, 99, 10, 1};
            intSorter.sort(intArray, Integer::compareTo);
            System.out.println(Arrays.toString(intArray));
        }

        if (stringSorter != null) {
            String[] nomes = {"Ednaldo", "Pereira", "Ana", "Beto", "Julio"};
            stringSorter.sort(nomes, String::compareToIgnoreCase);
            System.out.println(Arrays.toString(nomes));
        }
        System.out.println("Ta funcionando professor! CONFIA!!!");
    }
}
