package com.neha.spring.annotation.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

//      ApplicationContext context = new AnnotationConfigApplicationContext("com.neha.spring.annotation.library");
//        LibraryService libraryService = context.getBean(LibraryService.class);
//        libraryService.searchBook();

        BookRepository bookRepository = new BookRepository();
        LibraryService libraryService2 = new LibraryService(bookRepository);
        libraryService2.searchBook();

    }
}
