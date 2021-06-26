package Ex02_tm.mateus.ex3;
//Crie uma classe Book com os métodos: empréstimo, devolver e toString, cujo protótipo deve ser: public String toString ().
// Este método deve retornar uma string que representa o objeto.
// Por exemplo: se a classe tiver os atributos: título, isbn e autor, uma string representando um livro poderia ser:
// "Harry Potter, 9780545582889, Rowling, J. K.". A classe conterá um construtor padrão, um construtor com parâmetros e os métodos de acesso.

//  Adicione a linha @Override logo acima do cabeçalho do método toString. Em seguida, renomeie o método para: tostring (tudo em letras minúsculas).
//  O que acontece?

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("livro 1", 1, "autor1");
        Book book2 = new Book("livro 2", 1, "autor2");
        Book book3 = new Book("livro 3", 1, "autor1");

        book1.emprestar();

        book2.emprestar();

        book1.devolver();


        book3.devolver();

        book2.emprestar();

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
    }
}
