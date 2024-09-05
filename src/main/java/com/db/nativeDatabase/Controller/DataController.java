package com.db.nativeDatabase.Controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.db.nativeDatabase.Entity.Book;
import com.db.nativeDatabase.Repository.BookRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;




@RestController
public class DataController {

    private final BookRepository data;

    public DataController(BookRepository data) {
        this.data = data;
    }
    
   @GetMapping("/findAllData")
   public List<Book> getMethodName() {
       return data.findAll();
   }
   
//    @PostMapping("/findDataID")
//    public Optional<Book> postMethodName(@RequestBody Map<String, Object> payload) {
//    Long id = Long.valueOf(payload.get("id").toString());
//        return data.findById(id);
//    }

    @PostMapping("/findDataID")
    public Optional<Book> postMethodName(@RequestParam long id) {
        String query = "SELECT * FROM users WHERE username = '" + id + "'";
        String queryๅ = "SELECT * FROM users WHERE username = '" + id + "'";

        String query2 = "SELECT * FROM users WHERE username = '" + id + "'";

        return data.findById(id);
    }

   
    
}
