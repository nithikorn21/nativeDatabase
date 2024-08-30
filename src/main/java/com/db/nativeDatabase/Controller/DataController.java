package com.db.nativeDatabase.Controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.db.nativeDatabase.Entity.Book;
import com.db.nativeDatabase.Repository.BookRepository;
import com.db.nativeDatabase.Resolver.BookResolver;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;




@RestController
public class DataController {

    private final BookRepository data;
    private final BookResolver bookql;

    public DataController(BookRepository data, BookResolver bookql) {
        this.data = data;
        this.bookql = bookql;
    }
    
   @GetMapping("/findAllData")
   public List<Book> findAllData() {
       return data.findAll();
   }
   
//    @PostMapping("/findDataID")
//    public Optional<Book> postMethodName(@RequestBody Map<String, Object> payload) {
//    Long id = Long.valueOf(payload.get("id").toString());
//        return data.findById(id);
//    }

    @PostMapping("/findDataID")
    public Optional<Book> findDataID(@RequestParam long id) {
        return data.findById(id);
    }

    @PostMapping("/findDataIDQL")
    public Book findDataIDQL(@RequestParam long id) {
        return bookql.getBookById(id);
    }

   
    
}
