package com.example.first_postgress_with_spring_boot.controller;

import com.example.first_postgress_with_spring_boot.model.PublisherModel;
import com.example.first_postgress_with_spring_boot.service.PublisherService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/publisher")
public class PublisherController {
    private final PublisherService publisherService;

    public PublisherController(PublisherService publisherService){
        this.publisherService = publisherService;
    }

    @GetMapping()
    public String Hello(){
        return "Hello welcome to Publisher Session";
    }


    @PostMapping("/add-new")
    public ResponseEntity<String> addNewPublisher(@RequestBody PublisherModel publisherModel) {
        publisherService.save(publisherModel);
        return ResponseEntity.ok("Publisher criado com sucesso!");
    }


}
