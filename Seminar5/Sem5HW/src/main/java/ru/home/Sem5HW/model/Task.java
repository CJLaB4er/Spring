package ru.home.Sem5HW.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data // lombok, заполнение класса геттерами, сеттерами, конструкторами, toString переопределение HashCode и equals
@Entity // hibernate, класс предназначен для хранения в БД
@Table(name = "tasks") // указано наименование таблицы в БД, отличное от названия класса
public class Task {

    @Id // поле является первичным ключем
    //поле генерируется автоматически. Стратегия IDENTITY - поле генерирует БД как AUTOINCREMENT
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false) // поле не может быть null
    private String title;

    private String description;

    @Enumerated(EnumType.STRING) // хранение объекта типа Enumerated в строковом виде
    private TaskStatus status;

    @Column(name = "create_data") // вариант переименования столбца таблицы для хранения поля createData
    private LocalDateTime createData = LocalDateTime.now();
}
