package com.db.nativeDatabase.Domain;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.db.nativeDatabase.Entity.Book;
import com.db.nativeDatabase.Service.BookService;

public class BookDomain {

    @Autowired
    private BookService bookService;

    public List<Book> findAllBooks() {
        return bookService.findAll();
    }

    public Book findBook(@PathVariable Long id) {
        return bookService.findById(id);
    }

    public Book saveBook(@RequestBody Book book) {
        return bookService.save(book);
    }

    public void deleteBook(@PathVariable Long id) {
        bookService.deleteById(id);
    }
}
