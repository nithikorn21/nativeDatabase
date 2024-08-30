package com.db.nativeDatabase.Resolver;

import java.util.List;

import org.springframework.stereotype.Component;

import com.db.nativeDatabase.Entity.Book;
import com.db.nativeDatabase.Repository.BookRepository;

import graphql.kickstart.tools.GraphQLQueryResolver;

@Component
public class BookResolver implements GraphQLQueryResolver {
    private final BookRepository bookRepository;

    public BookResolver(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book getBookById(Long id) {
        return bookRepository.findById(id).orElseThrow(() -> new RuntimeException("Book not found"));
    }
}

