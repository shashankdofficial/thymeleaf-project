package com.practice.controller;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

	@GetMapping("/about")
	public String about(Model model) {
		System.out.println("Inside about handler...");

		// Putting data in model
		model.addAttribute("name", "Shashank Dubey");

		model.addAttribute("currentDate", new Date().toLocaleString());

		return "about";
	}

	// handling Iteration using Thymeleaf
	@GetMapping("/example-loop")
	public String iterateHandler(Model m) {

		// create a list, Set, Map, any Collection
		List<String> names = List.of("Ankit","Lakshmi","Karan","Jhon");
		
		m.addAttribute("names", names);
		
		return "iterate";
	}
	
	//Handler for conditional statement
	@GetMapping("/condition")
	public String conditionHandler(Model m) {
		System.out.println("Conditional handler executed...");
		
		m.addAttribute("isActive", false);
		m.addAttribute("gender", "F");
		
		List<Integer> list = List.of(233,43,53,65,64);
		
		m.addAttribute("mylist", list);
		
		return "condition";
	}
	
	//Handler for including fragments
	@GetMapping("/service")
	public String servicesHandler(Model m) {
		
		m.addAttribute("title", "I like to drink Milk");
		m.addAttribute("subtitle", LocalDateTime.now().toString());
		return "service";
	}
}
