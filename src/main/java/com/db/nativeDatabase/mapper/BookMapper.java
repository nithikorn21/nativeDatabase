package com.db.nativeDatabase.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.db.nativeDatabase.Entity.Book;

@Mapper
public interface BookMapper {
    Book selectID(int id);
    void insertBook(Book data);
    void updateBook(Book data);
    void deleteBook(int id);
}
