package com.bootcampmeli.bookstore.repositories;

import com.bootcampmeli.bookstore.entities.Book;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, String>{
    
}
