package com.neha.spring.annotation.library;

import org.springframework.stereotype.Component;

@Component
public class BookRepository {
    public void findBook(String title) {
        System.out.println("Finding book: " + title);
    }
}
