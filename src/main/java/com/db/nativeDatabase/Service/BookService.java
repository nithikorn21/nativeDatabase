package com.db.nativeDatabase.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.db.nativeDatabase.Entity.Book;
import com.db.nativeDatabase.mapper.BookMapper;

@Service
public class BookService {
  @Autowired
  private BookMapper BookMapper;

  public Book getฺBookById(int id) {
    return BookMapper.selectID(id);
  }

  public void insertBook(Book data) {
    BookMapper.insertBook(data);
  }

  public void updateBook(Book data) {
    BookMapper.updateBook(data);
  }

  public void deleteBook(int id) {
    BookMapper.deleteBook(id);
  }
}
