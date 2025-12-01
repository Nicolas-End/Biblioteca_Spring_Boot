package com.example.first_postgress_with_spring_boot.service;

import com.example.first_postgress_with_spring_boot.model.PublisherModel;
import com.example.first_postgress_with_spring_boot.repository.PublisherRepository;
import org.springframework.stereotype.Service;

@Service
public class PublisherService {
    private final PublisherRepository publisherRepository;

    public PublisherService(PublisherRepository publisherRepository) {
        this.publisherRepository = publisherRepository;
    }

    public void save(PublisherModel publisherModel){
        this.publisherRepository.save(publisherModel);
    }
}
