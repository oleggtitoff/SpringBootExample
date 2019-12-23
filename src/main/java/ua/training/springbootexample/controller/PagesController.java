package ua.training.springbootexample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PagesController {

    @GetMapping("/")
    public String main() {
        return "index";
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello_world";
    }
}
