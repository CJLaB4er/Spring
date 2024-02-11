package ru.home.seminar4hometask.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Controller
public class webAppController {
    @RequestMapping
    public String index() {
        return "index";
    }

    /*Вывод текущей даты и времени через Thymeleaf*/
    @GetMapping("/time")
    public String time(Model model) {
        LocalDateTime currentDatetime = LocalDateTime.now();
        String date = currentDatetime.format(DateTimeFormatter.ofPattern("dd MMMM yyyyг.")).toString();
        String time = currentDatetime.format(DateTimeFormatter.ofPattern("HH:mm:ss")).toString();
        model.addAttribute("currentTime", time);
        model.addAttribute("currentDate", date);
        return "time";
    }

}
