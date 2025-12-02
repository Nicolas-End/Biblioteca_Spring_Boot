package com.example.first_postgress_with_spring_boot.controller;

import com.example.first_postgress_with_spring_boot.service.AuthorService;
import com.example.first_postgress_with_spring_boot.service.PublisherService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/author")
public class AuthorController {
    private final AuthorService authorService;

    public AuthorController(AuthorService authorService){
        this.authorService = authorService;
    }

    @GetMapping()
    public String WellCome(){
        return "WellCome to the AuthorPage";
    }

}
