// package com.db.nativeDatabase.Repository;

// import com.db.nativeDatabase.Entity.Book;

// import io.quarkus.hibernate.orm.panache.PanacheRepository;
// import jakarta.enterprise.context.ApplicationScoped;
// @ApplicationScoped
// public class BookRepository implements  PanacheRepository<Book> {
//     public Book findByTitle(String title) {
//         return find("title", title).firstResult();
//     }
// }
