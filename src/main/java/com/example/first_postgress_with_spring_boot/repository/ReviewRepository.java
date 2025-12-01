package com.example.first_postgress_with_spring_boot.repository;

import com.example.first_postgress_with_spring_boot.model.ReviewModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ReviewRepository extends JpaRepository<ReviewModel, UUID> {
}
