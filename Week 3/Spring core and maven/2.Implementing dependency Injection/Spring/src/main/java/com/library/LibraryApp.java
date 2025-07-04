package com.library;

import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryApp {
    public static void main(String[] args) {

        // Load Spring XML context
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Get BookService bean from Spring container
        BookService bookService = context.getBean("bookService", BookService.class);

        // Call the service to test DI
        bookService.addBook("1984 by George Orwell");
    }
}
