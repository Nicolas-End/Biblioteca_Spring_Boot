package com.example.first_postgress_with_spring_boot.service;

import com.example.first_postgress_with_spring_boot.repository.AuthorRepository;
import com.example.first_postgress_with_spring_boot.repository.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {
    private final AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository= authorRepository;
    }
}
