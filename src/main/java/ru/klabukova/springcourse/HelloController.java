package ru.klabukova.springcourse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	//configuration with xml-files

    @GetMapping("/hello-world")
    public String sayHello() {
        return "hello_world";
    }
}
