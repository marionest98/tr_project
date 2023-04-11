package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	
	@GetMapping("/hello") //리턴값이 없으면 uri를 뷰네임으로 삼는다.
	public void hello(Model m) {
		m.addAttribute("hello", "hello,spring!");
		//return "hello";//view name
	}

}
