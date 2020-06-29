package maga.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("todo-list")
public class DemoController {

    // http://localhost:8080/todo-list/hello
    @GetMapping("/hello")
    public String hello(){
        return "Hello";
    }
}
