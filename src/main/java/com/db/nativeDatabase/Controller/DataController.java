package com.db.nativeDatabase.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.db.nativeDatabase.Entity.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
@RestController
@RequestMapping("/api")
public class DataController {

    @GetMapping("/{title}")
    public Book postMethodName(@PathVariable String title) {
        return Book.findByTitle(title);
    }
}

