package JavaAula1;
import JavaAula1.Empresa.Produto;

public class Q8 {
    public static void main(String[] args) {
        Produto[] listaProdutos = new Produto[3];
        double totalLista = 0;

        listaProdutos[0] = new Produto("Arroz", 10, 4);
        listaProdutos[1] = new Produto("Feijao", 20, 2);
        listaProdutos[2] = new Produto("Tomate", 40, 1);

        for (int i = 0; i < listaProdutos.length; i++) {
            System.out.println("Produto " + (i+1));
            System.out.println(listaProdutos[i] + "\n");
            totalLista += listaProdutos[i].getTotal();
        }

        System.out.println("Total: " + totalLista);
    }
}
