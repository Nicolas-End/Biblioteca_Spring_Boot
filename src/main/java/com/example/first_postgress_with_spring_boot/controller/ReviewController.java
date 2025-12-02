package com.example.first_postgress_with_spring_boot.controller;

import com.example.first_postgress_with_spring_boot.service.ReviewService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/review")
public class ReviewController {
    private final ReviewService reviewService;

    public ReviewController (ReviewService reviewService){
        this.reviewService = reviewService;
    }
}
