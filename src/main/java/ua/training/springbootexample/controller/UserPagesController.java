package ua.training.springbootexample.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
@Secured({"ROLE_USER", "ROLE_ADMIN"})
public class UserPagesController {

    @RequestMapping({"/", "/index"})
    public String getIndexPage() {
        return "user/index";
    }

    @RequestMapping("/hello")
    public String getHelloPage() {
        return "user/hello_world";
    }

}
