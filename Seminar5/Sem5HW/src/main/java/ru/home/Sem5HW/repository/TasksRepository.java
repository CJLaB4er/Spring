package ru.home.Sem5HW.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.home.Sem5HW.model.Task;
import ru.home.Sem5HW.model.TaskStatus;

import java.util.List;

public interface TasksRepository extends JpaRepository<Task, Long> {

    // генерация метода по ключевым словам
    public List<Task> findByStatus(TaskStatus taskStatus);
}
