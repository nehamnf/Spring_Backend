package com.neha.spring.annotation.library;

import org.springframework.stereotype.Component;

@Component
public class LibraryService {

    private final BookRepository bookRepository;
    public LibraryService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void searchBook() {
        bookRepository.findBook("Indian Revolution");
    }
}
