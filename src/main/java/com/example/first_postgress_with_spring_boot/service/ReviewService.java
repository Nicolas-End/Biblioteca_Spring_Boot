package com.example.first_postgress_with_spring_boot.service;

import com.example.first_postgress_with_spring_boot.repository.PublisherRepository;
import com.example.first_postgress_with_spring_boot.repository.ReviewRepository;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {
    private final ReviewRepository reviewRepository;

    public ReviewService(ReviewRepository reviewRepository){
        this.reviewRepository = reviewRepository;
    }
}
