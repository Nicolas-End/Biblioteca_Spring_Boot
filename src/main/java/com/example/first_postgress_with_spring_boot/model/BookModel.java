package com.example.first_postgress_with_spring_boot.model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
// Declara o nome da tabela
@Table(name = "TB_BOOK")
@Data
public class BookModel implements Serializable {
    // serve para serialização do conteudo
    private  static final long serialVersionUID = 1L;

    @Id
    // Gera o Id Automaticamente
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;


    @Column(nullable = false, unique = true)
    private String title;

    @ManyToOne
    @JoinColumn(name = "publisher",nullable = false)
    private PublisherModel publisher;

    @ManyToMany
    @JoinTable(
            name="tb_book_author",
            joinColumns = @JoinColumn(name ="book_id"),
            inverseJoinColumns = @JoinColumn(name = "author_id")
    )
    private Set<AuthorModel> authors = new HashSet<>();

    @OneToOne(mappedBy = "book", cascade = CascadeType.ALL)
    private ReviewModel review;


}
