package com.bootcampmeli.bookstore.controllers;

import java.util.List;

import com.bootcampmeli.bookstore.dtos.BookDTO;
import com.bootcampmeli.bookstore.dtos.UpsertBookDTO;
import com.bootcampmeli.bookstore.services.BookService;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {
    
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public List<BookDTO> getBooks() {
        return this.bookService.getAllBooks();
    }

    @GetMapping("{id}")
    public BookDTO getBookById(@PathVariable String id) {
        return this.bookService.getBookById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public BookDTO createBook(@RequestBody UpsertBookDTO upsertBookDTO) {
        return this.bookService.createBook(upsertBookDTO);
    }

    @PutMapping("{bookId}")
    public BookDTO updateBook(
            @PathVariable String bookId, 
            @RequestBody UpsertBookDTO upsertBookDTO){
        return this.bookService.updateBook(bookId, upsertBookDTO);
    }

    @DeleteMapping("{bookId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBook(@PathVariable String bookId) {
        this.bookService.deleteBook(bookId);
    }
}
