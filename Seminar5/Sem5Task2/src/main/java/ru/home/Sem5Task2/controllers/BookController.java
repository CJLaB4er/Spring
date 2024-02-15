package ru.home.Sem5Task2.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.home.Sem5Task2.model.Book;
import ru.home.Sem5Task2.services.BookService;

import java.util.List;

@RestController
@RequestMapping("/books")
@AllArgsConstructor
public class BookController {
    private final BookService bookService;

    @GetMapping()
    public List<Book> getAllBook() {
        return bookService.getAllBooks();
    }
}
