package com.library.repository;

import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {
    public void displayData() {
        System.out.println("Displaying book data from repository.");
    }
}
