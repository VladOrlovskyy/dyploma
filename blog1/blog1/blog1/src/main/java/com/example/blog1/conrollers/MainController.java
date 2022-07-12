package com.example.blog1.conrollers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Головна сторінка");
        return "home";
    }

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("title", "Сторінка про нас");
        return "about";
    }

    // Сторінка зворотнього зв'язку
    @GetMapping("/feedback")
    public String feedbackAdd(Model model) {
        return "feedback";
    }
    @GetMapping("/blog/add")
    public String blogAdd(Model model) {
        return "blog-add";
    }



}