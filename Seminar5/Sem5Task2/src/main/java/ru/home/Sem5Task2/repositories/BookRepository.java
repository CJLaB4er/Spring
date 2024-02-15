package ru.home.Sem5Task2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.home.Sem5Task2.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}
