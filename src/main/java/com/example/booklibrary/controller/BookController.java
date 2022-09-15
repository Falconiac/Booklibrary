package com.example.booklibrary.controller;

import com.example.booklibrary.model.Book;
import com.example.booklibrary.repository.BookDB;
import com.example.booklibrary.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    private BookService service;

    @Autowired
    public BookController(BookService service) {
        this.service = service;
    }

    @GetMapping
    public List returnAllBooks(){
        return service.serviceGetAllBooks();
    }

    @GetMapping(path = "{id}")
    public Book controllerGetBookById(@PathVariable String id){
        return service.serviceGetBookById(id);
    }


}
