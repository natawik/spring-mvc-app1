package ru.klabukova.springcourse.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/first")
public class FirstController {
	
	@GetMapping("/hello")
	public String helloPage(HttpServletRequest request) {
		String name = request.getParameter("name");
		String surname = request.getParameter("surname");
		
		System.out.println("Hello, " + name + " " + surname + "!");
		return "first/hello";
	}
	
	@GetMapping("/goodbye")
	public String goodByePage() {
		return "first/goodbye";
	}

}
