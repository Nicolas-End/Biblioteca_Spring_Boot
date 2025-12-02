package com.example.first_postgress_with_spring_boot.service;

import com.example.first_postgress_with_spring_boot.repository.BookRepository;
import com.example.first_postgress_with_spring_boot.repository.PublisherRepository;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository= bookRepository;
    }
}
