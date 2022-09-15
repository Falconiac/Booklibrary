package com.example.booklibrary.service;

import com.example.booklibrary.model.Book;
import com.example.booklibrary.repository.BookDB;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private BookDB books;

    public BookService(BookDB bookDB) {
        this.books = bookDB;
    }

    public List<Book> serviceGetAllBooks(){
        return books.getAllBooks();
    }

    public Book serviceGetBookById(String id){
        return books.getBookById(id);

    }
}
