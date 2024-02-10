package ru.home.seminar4task2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.MissingFormatArgumentException;
import java.util.Random;

@Controller
public class RandomController {
    @GetMapping("/random")
    public String rndPage(Model model) {
        int rnd = new Random().nextInt(100) + 1;
        model.addAttribute("number", rnd);
        return "rndPage";
    }

    @GetMapping("/range")
    public String rangePage(@RequestParam("min") int min,
                            @RequestParam("max") int max,
                            Model model) {
        int rnd = new Random().nextInt(min, max + 1);
        model.addAttribute("number", rnd);
        model.addAttribute("min", min);
        model.addAttribute("max", max);
        return "rndPAge";
    }

    @GetMapping("/range/{min}/{max}")
    public String rangePagePath(@PathVariable("min") int min,
                                @PathVariable("max") int max,
                                Model model) {
        int rnd = new Random().nextInt(min, max + 1);
        model.addAttribute("number", rnd);
        model.addAttribute("min", min);
        model.addAttribute("max", max);
        return "rndPAge";
    }

    @GetMapping("/range/{min}-{max}")
    public String rangePagePathDf(@PathVariable("min") int min,
                                @PathVariable("max") int max,
                                Model model) {
        int rnd = new Random().nextInt(min, max + 1);
        model.addAttribute("number", rnd);
        model.addAttribute("min", min);
        model.addAttribute("max", max);
        return "rndPAge";
    }
}
