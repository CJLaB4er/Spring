package ru.geekbrain.example3sem3hometask.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.geekbrain.example3sem3hometask.domain.User;

@Service
public class RegistrationService {
    //Поля UserService, NotificationService
    @Autowired
    private UserService userService;
    @Autowired
    private NotificationService notificationService;

    public DataProcessingService getDataProcessingService() {
        return dataProcessingService;
    }

    @Autowired
    private DataProcessingService dataProcessingService;


    //Метод processRegistration
    public User processRegistration(String name, int age, String mail) {
        User user = new User();
        user.setName(name);
        user.setAge(age);
        user.setEmail(mail);

        notificationService.notifyUser(user);

        return user;
    }


}
