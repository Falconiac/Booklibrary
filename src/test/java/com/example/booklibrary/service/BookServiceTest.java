package com.example.booklibrary.service;

import com.example.booklibrary.model.Book;
import com.example.booklibrary.repository.BookDB;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class BookServiceTest {

    BookDB bookDB = mock(BookDB.class);
    BookService service = new BookService(bookDB);

    @Test
    void serviceGetAllBooks() {
        List<Book> testList = new ArrayList<>();

        Book tester1 = new Book("haha","hoho","1");
        Book tester2 = new Book("haha","hoho","2");
        Book tester3 = new Book("haha","hoho","3");

        testList.add(tester1);
        testList.add(tester2);
        testList.add(tester3);

        when(bookDB.getAllBooks()).thenReturn(List.of(tester1,tester2,tester3));

        List<Book> actual = service.serviceGetAllBooks();

        assertEquals(testList,actual);
    }

    @Test
    void serviceGetBookById() {
        //given
        String id = "1";
        Book tester1 = new Book("haha","hoho","1");
        when(bookDB.getBookById(id)).thenReturn(tester1);

        //when
        Book actual = service.serviceGetBookById(id);

        //then
        assertEquals(tester1, actual);
    }
}