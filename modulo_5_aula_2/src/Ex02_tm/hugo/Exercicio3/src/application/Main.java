/*
Crie uma classe Book com os métodos: empréstimo, devolver e toString, cujo protótipo deve ser: public String toString().
Este método deve retornar uma string que representa o objeto.
Por exemplo: se a classe tiver os atributos: título, isbn e autor,
uma string representando um livro poderia ser: "Harry Potter, 9780545582889, Rowling, J. K.".
A classe conterá um construtor padrão, um construtor com parâmetros e os métodos de acesso.

Adicione a linha @Override logo acima do cabeçalho do método toString.
Em seguida, renomeie o método para: tostring (tudo em letras minúsculas). O que acontece?
 */

package application;

import entities.Book;

public class Main {
    public static void main(String[] args){
        Book bk1 = new Book();
        Book bk2 = new Book("Harry Potter", "9923371283", "J.K. Rowling");

        bk1.setTitulo("O Senhor dos Anéis: A Sociedade do Anel");
        bk1.setIsbn("9392133893");
        bk1.setAutor("Tolkien");

        Book bk3 = new Book(bk1);

        System.out.println(bk1);
        System.out.println(bk2);
        System.out.println(bk3);

        if (bk1.emprestimo()){
            System.out.println("O livro " + bk1.getTitulo() + " foi emprestado com sucesso.");
        } else{
            System.out.println("O livro " + bk1.getTitulo() + " já está emprestado");
        }

        if (bk2.devolucao()){
            System.out.println("O livro " + bk2.getTitulo() + " foi devolvido com sucesso.");
        } else{
            System.out.println("O livro " + bk2.getTitulo() + " não está emprestado para poder ser devolvido.");
        }

        if (bk1.devolucao()){
            System.out.println("O livro " + bk1.getTitulo() + " foi devolvido com sucesso.");
        } else{
            System.out.println("O livro " + bk2.getTitulo() + "não está emprestado para poder ser devolvido.");
        }
    }
}
