package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/rest")
public class RestTestController {
	
	@GetMapping
	public String form() {
		return "rest/form";
	}
	
	@PostMapping
	public String postSubmit(String name) {
		System.out.println("name : "+name);
		return "redirect:/"; //경로없음 welcom index.html로 감
	}
	
	@PutMapping
	public String putSubmit(String name) {
		System.out.println("put : "+name);
		return "redirect:/";
	}
	
	@DeleteMapping
	public String deleteSubmit(String name) {
		System.out.println("delete : "+name);
		return "redirect:/";
	}
}
