package Ex02_tm.wincenty;

public class TestBook {
    public static void main(String[] args) {
        Book livro = new Book();

        livro.setAutor("Rowling, J. K");
        livro.setIsbn(12345);
        livro.setTítulo("Harry Potter");

        System.out.println(livro);
    }
}
