package com.example.first_postgress_with_spring_boot.controller;

import com.example.first_postgress_with_spring_boot.service.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")

public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService){
        this.bookService = bookService;
    }
    @GetMapping()
    public String Hello(){
        return "Hello welcome to Book Session";
    }


}
