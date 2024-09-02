package com.db.nativeDatabase.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.db.nativeDatabase.Entity.Book;
import com.db.nativeDatabase.Repository.BookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@RestController
@RequestMapping("/api")
public class DataController {

    private final BookRepository bookRepository;

    @Autowired
    public DataController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @PostMapping("/findByTitle")
    public Book postMethodName(@RequestParam String title) {
        return bookRepository.findByTitle(title);
    }
}

