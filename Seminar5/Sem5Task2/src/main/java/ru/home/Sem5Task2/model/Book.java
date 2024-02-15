package ru.home.Sem5Task2.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String title, author;
    @Column(nullable = true, name = "publication_year")
    private Integer publicationYear;
}

