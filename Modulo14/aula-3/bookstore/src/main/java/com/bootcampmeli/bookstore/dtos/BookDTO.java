package com.bootcampmeli.bookstore.dtos;

import com.bootcampmeli.bookstore.entities.Book;

public class BookDTO {
    private String id;
    private String author;
    private String bookTitle;

    
    public BookDTO() {}

    public BookDTO(String id, String author, String bookTitle) {
        this.id = id;
        this.author = author;
        this.setBookTitle(bookTitle);
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    
    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public static BookDTO toDTO(Book book) {
        return new BookDTO(book.getId(), book.getAuthor(), book.getBookTitle());
    }
}