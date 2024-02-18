package ru.home.Sem5HW.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.home.Sem5HW.model.Task;
import ru.home.Sem5HW.model.TaskStatus;
import ru.home.Sem5HW.repository.TasksRepository;

import java.time.LocalDateTime;
import java.util.List;

@Service
@AllArgsConstructor
public class TaskService {
    private final TasksRepository tasksRepository;

    /**
     * Получение всех задач.
     *
     * @return List Task
     */
    public List<Task> getAllTasks() {
        return tasksRepository.findAll();
    }

    /**
     * Добавлеие задачи
     *
     * @return Task
     */
    public Task createTask(Task task) {
        return tasksRepository.save(task);
    }

    /**
     * Получение задач соответствующих переданному статусу
     *
     * @return List Task
     */
    public List<Task> getTasksByStatus(TaskStatus taskStatus) {
        return tasksRepository.findByStatus(taskStatus);
    }

    /**
     * Обновление статуса задачи, на переданный
     *
     * @return Task
     */
    public Task updateTaskStatus(Long id, TaskStatus status) {
        Task task = tasksRepository.findById(id).orElse(null);
        if (task != null) {
            task.setStatus(status);
        }
        return tasksRepository.save(task);
    }

    /**
     * Удаление задачи по переданному id
     *
     * @return void
     */
    public void deleteById(Long id) {
        tasksRepository.deleteById(id);
    }


}
