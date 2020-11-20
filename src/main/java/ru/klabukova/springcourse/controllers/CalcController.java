package ru.klabukova.springcourse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/calculator")
public class CalcController {
	@GetMapping("/action")
	public String addPage(@RequestParam(value = "a", required = false) int a,
							@RequestParam(value ="b", required = false) int b,
							String action,
							Model model) {
		double result;
		switch(action) {
			case "add":
				result = a + b;
				break;
			case "sub":
				result = a - b;
				break;
			case "mul":
				result = a * b;
				break;
			case "div":
				result = a / (double) b;
				break;
			default:
				result = 0;
				break;
		}
		
		model.addAttribute("result", result);
	
		return "calculator/action";
	}
	
}
