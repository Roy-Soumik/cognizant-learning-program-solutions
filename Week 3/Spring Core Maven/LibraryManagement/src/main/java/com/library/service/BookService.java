package com.library.service;

import com.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    private BookRepository bookRepository;

    //    @Autowired
    //    public void setBookRepository(BookRepository bookRepository) {
    //        this.bookRepository = bookRepository;
    //    }

    public BookService(BookRepository bookRepository) {
        System.out.println("Constructor Injection used.");
        this.bookRepository = bookRepository;
    }

    public void setBookRepository(BookRepository bookRepository) {
        System.out.println("Setter Injection used.");
        this.bookRepository = bookRepository;
    }

    public String findBookTitleById(int id) {
        return "Book #" + id;
    }

//    USED IN QUESTON 2
//    public void displayBookInfo() {
//        System.out.println("Service layer called.");
//        bookRepository.displayData();
//    }

    public void printBookInfo() {
        System.out.println("BookService is working.");
        bookRepository.displayData();
    }
}
