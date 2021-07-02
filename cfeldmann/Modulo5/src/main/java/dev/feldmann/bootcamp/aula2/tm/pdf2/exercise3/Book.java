package dev.feldmann.bootcamp.aula2.tm.pdf2.exercise3;

public class Book {
    String title;
    String isbn;
    String author;

    public boolean rented = false;

    public Book(String title, String isbn, String author) {
        this.title = title;
        this.isbn = isbn;
        this.author = author;
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isRented() {
        return rented;
    }

    public void rentBook() {
        this.rented = true;
    }

    public void returnBook() {
        this.rented = false;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", isbn='" + isbn + '\'' +
                ", author='" + author + '\'' +
                ", rented=" + rented +
                '}';
    }
}
