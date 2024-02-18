package ru.home.Sem5HW.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.home.Sem5HW.model.Task;
import ru.home.Sem5HW.model.TaskStatus;
import ru.home.Sem5HW.services.TaskService;

import java.util.List;

@RestController // помечает класс аннотацией @Controller и преобразует входящие данные в json или xml
@AllArgsConstructor //lombok, создает констуктор со всеми параметрами
public class TaskController {
    private final TaskService taskService;

    /**
     * Получение всех задач
     *
     * @return List Task
     */
    @GetMapping("/tasks") // отслеживание GET запросов по адресу /tasks
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }


    /**
     * Получение списка задач соответствующих переданному статусу
     *
     * @return List Task
     */
    @GetMapping("/status/{status}") // Get запрос с передачей параметра {status}
    public List<Task> getTasksByStatus(@PathVariable TaskStatus status) {
        return taskService.getTasksByStatus(status);
    }

    /**
     * Обновление статуса задачи, на переданный
     *
     * @return Task
     */
    @PutMapping("/updatestatus/{id}") // Put запрос с передачей параметра {id}
    public Task updateTaskStatus(@PathVariable Long id, @RequestBody Task task) {
        return taskService.updateTaskStatus(id, task.getStatus());
    }

    /**
     * Добавление новой задачи в репозиторий, на основе переданного json
     *
     * @return List Task
     */
    @PostMapping("/tasks") // отслеживание POST запросов по адресу /tasks
    // @RequestBody - автоматическая десериализация входящего объекта в Task task
    public Task addTask(@RequestBody Task task) {
        return taskService.createTask(task);
    }

    /**
     * Удаление задачи по переданному id
     *
     * @return void
     */
    @DeleteMapping("/delete/{id}")
    public void deleteTask(@PathVariable Long id) {
        taskService.deleteById(id);
    }

}
