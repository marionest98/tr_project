package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.command.ACommand;

@Controller
@RequestMapping("a")
public class AController {
	
	@GetMapping
	public String aform() {
		return "a/form";
	}
	
	@PostMapping
	public String asubmit(@ModelAttribute("a") ACommand a) {
		System.out.println(a);
		return "a/submit";
	}
	
}
