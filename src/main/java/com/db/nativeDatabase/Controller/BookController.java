package com.db.nativeDatabase.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.db.nativeDatabase.Domain.BookDomain;
import com.db.nativeDatabase.Entity.Book;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookDomain BookDomain;

    @GetMapping
    public List<Book> getAllBooks() {
        return BookDomain.findAllBooks();
    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable Long id) {
        return BookDomain.findBook(id);
    }

    @PostMapping
    public Book createBook(@RequestBody Book book) {
        return BookDomain.saveBook(book);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id) {
        BookDomain.deleteBook(id);
    }
}
