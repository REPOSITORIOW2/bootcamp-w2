package com.bootcampmeli.bookstore.services;

import java.util.List;
import java.util.stream.Collectors;

import com.bootcampmeli.bookstore.dtos.BookDTO;
import com.bootcampmeli.bookstore.dtos.UpsertBookDTO;
import com.bootcampmeli.bookstore.entities.Book;
import com.bootcampmeli.bookstore.repositories.BookRepository;

import org.springframework.stereotype.Service;

@Service
public class BookService {

    private final BookRepository bookRepository;

	public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<BookDTO> getAllBooks() {
		return this.bookRepository.findAll()
                .stream()
                .map(BookDTO::toDTO)
                .collect(Collectors.toList());
	}

	public BookDTO getBookById(String id) {
		Book book = this.bookRepository
            .findById(id)
            .orElseThrow(
                () -> new RuntimeException("Book with id " + id + " was not found :("));

        return BookDTO.toDTO(book);
	}

    public BookDTO createBook(UpsertBookDTO upsertBookDTO) {
        Book book = new Book(
            upsertBookDTO.getAuthor(),
            upsertBookDTO.getBookTitle()
        );

        Book savedBook = this.bookRepository.save(book);

        return BookDTO.toDTO(savedBook);
    }

    public BookDTO updateBook(String bookId, UpsertBookDTO upsertBookDTO) {
        Book book = this.bookRepository
            .findById(bookId)
            .orElseThrow(() -> 
                new RuntimeException("Book with id " + bookId + " was not found :("));

        book.setAuthor(upsertBookDTO.getAuthor());
        book.setBookTitle(upsertBookDTO.getBookTitle());

        Book savedBook = this.bookRepository.save(book);

        return BookDTO.toDTO(savedBook);
    }

    public void deleteBook(String bookId){
        this.bookRepository.deleteById(bookId);
    }
}