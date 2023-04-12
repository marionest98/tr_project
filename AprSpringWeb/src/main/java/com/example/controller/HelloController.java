package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;

@Controller
public class HelloController {
	
	@GetMapping("/hello") //리턴값이 없으면 uri를 뷰네임으로 삼는다.
	public void hello(Model m) {
		m.addAttribute("hello", "hello,spring!");
		//return "hello";//view name
	}
	
	@GetMapping("/jsondata")
	@ResponseBody
	public String getJson() {
		List<String> list = new ArrayList<>();
		list.add("apple");
		list.add("banana");
		list.add("tomato");
		list.add("사과");
		
		Gson gson = new Gson();
		return gson.toJson(list);
	}

}
