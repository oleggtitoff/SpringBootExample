package ua.training.springbootexample.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
@Secured("ROLE_ADMIN")
public class AdminPagesController {

    @RequestMapping({"/", "/index"})
    public String getIndexPage() {
        return "admin/index";
    }

    @RequestMapping("/hello")
    public String getHelloPage() {
        return "admin/hello_world";
    }

}
