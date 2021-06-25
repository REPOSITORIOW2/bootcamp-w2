import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Pratica2 {

    public static void sorts() {
        Integer[] array = {52, 10, 85, 1324, 01, 13, 62, 30, 12, 127};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        Arrays.sort(array, Collections.reverseOrder());
        System.out.println(Arrays.toString(array));
    }

    public static void empresas() {
        double valorEmpresaX = 1.13;
        double valorEmpresaY = 18.4;
        int ano = 2021;
        while (valorEmpresaX < valorEmpresaY) {
            valorEmpresaX = valorEmpresaX * 2.48;
            valorEmpresaY = valorEmpresaY * 1.32;
            ano++;
            System.out.println("Empresa X - 01/01/" + ano + " - Valor da empresa: " + valorEmpresaX);
            System.out.println("Empresa Y - 01/01/" + ano + " - Valor da empresa: " + valorEmpresaY);
        }
    }

    public static void supermercado() {
        Scanner in = new Scanner(System.in);
        Produto p1 = new Produto("Arroz", 10.99, 2);
        Produto p2 = new Produto("Feijão", 14.49, 1);
        Produto p3 = new Produto("Tomate", 9.99, 5);
        System.out.println("Produto 1\n" + p1.getNome() + "\nR$" + p1.getPreco() + "\nQuantidade: " + p1.getQtd() + "\n");
        System.out.println("Produto 2\n" + p2.getNome() + "\nR$" + p2.getPreco() + "\nQuantidade: " + p2.getQtd()+ "\n");
        System.out.println("Produto 3\n" + p3.getNome() + "\nR$" + p3.getPreco() + "\nQuantidade: " + p3.getQtd());
    }

    public static void main(String[] args) {
        //sorts();
        //empresas();
        supermercado();
    }
}
