package Ex02_tm.wincenty;

public class Book {

    private String título;
    private int isbn;
    private String autor;

    public Book() {
    }

    public Book(String título, int isbn, String autor) {
        this.título = título;
        this.isbn = isbn;
        this.autor = autor;
    }

    public String getTítulo() {
        return título;
    }

    public void setTítulo(String título) {
        this.título = título;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Book{" +
                "título='" + título + '\'' +
                ", isbn=" + isbn +
                ", autor='" + autor + '\'' +
                '}';
    }
}
