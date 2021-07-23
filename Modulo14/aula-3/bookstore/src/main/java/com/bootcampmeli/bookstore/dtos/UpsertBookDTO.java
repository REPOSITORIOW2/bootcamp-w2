package com.bootcampmeli.bookstore.dtos;

public class UpsertBookDTO {
    
    private String author;
    private String bookTitle;


    public UpsertBookDTO() {}

    public UpsertBookDTO(String author, String bookTitle) {
        this.author = author;
        this.bookTitle = bookTitle;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBookTitle() {
        return this.bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }
}
