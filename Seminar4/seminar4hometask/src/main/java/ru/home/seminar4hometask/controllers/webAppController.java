package ru.home.seminar4hometask.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class webAppController {
    @RequestMapping
    public String index() {
        return "index";
    }
}
