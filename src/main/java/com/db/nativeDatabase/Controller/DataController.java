package com.db.nativeDatabase.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.db.nativeDatabase.Entity.Book;
import com.db.nativeDatabase.Service.BookService;
import org.springframework.web.bind.annotation.PutMapping;





@RestController
@RequestMapping("/Book")
public class DataController {
    @Autowired
    private BookService bookService;
    
    @GetMapping("/{id}")
  public Book getUser(@PathVariable int id) {
    return bookService.getฺBookById(id);
  }

  @PostMapping
    public ResponseEntity<Book> createBook(@RequestBody Book book) {
        bookService.insertBook(book);
        return ResponseEntity.ok(book);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Book> putMethodName(@PathVariable("id") int id, @RequestBody Book book) {
        book.setId(id);
        bookService.updateBook(book);
        return ResponseEntity.ok(book);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBook(@PathVariable("id") int id) {
        bookService.deleteBook(id);
        return ResponseEntity.noContent().build();
    }
//     private final BookRepository data;

//     public DataController(BookRepository data) {
//         this.data = data;
//     }
    
//    @GetMapping("/findAllData")
//    public List<Book> getMethodName() {
//        return data.findAll();
//    }
   
//    @PostMapping("/findDataID")
//    public Optional<Book> postMethodName(@RequestBody Map<String, Object> payload) {
//    Long id = Long.valueOf(payload.get("id").toString());
//        return data.findById(id);
//    }

    // @PostMapping("/findDataID")
    // public Optional<Book> postMethodName(@RequestParam long id) {
    //     return data.findById(id);
    // }

   
    
}
