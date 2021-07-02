package JavaAula2;

import JavaAula2.ensino.Livro;

public class Q3 {
    public static void main(String[] args) {
        Livro l1 = new Livro("J R R Token", "111");
        Livro l2 = new Livro("G R R Martin", "222");
        Livro l3 = new Livro(l1);

        l1.emprestimo();
        l2.emprestimo();
        l2.devolucao();

        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
    }
}
