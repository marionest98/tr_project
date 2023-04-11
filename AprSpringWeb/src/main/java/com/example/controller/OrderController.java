package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.command.OrderCommand;

//GET  /order/order  : form 출력
//POST /order/order  : 요청파라미터 저장 후 출력

@Controller
@RequestMapping("/order/order")
public class OrderController {
	
	@GetMapping
	public String form() {
		return "order/orderForm"; //view name
	}
	@PostMapping
	public String submit(@ModelAttribute("order") OrderCommand orderCommand) {
		return "order/orderCompletion"; //view name
	}
}
