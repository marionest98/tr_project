package com.example.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.command.A;

@Controller
@RequestMapping("/a/a")
public class Acontroller {
	
	@GetMapping
	public String aform() {
		return "a/form";
	}
	
	@PostMapping
	public String asubmit(A a) {
		return "a/submit";
	}
	
}
