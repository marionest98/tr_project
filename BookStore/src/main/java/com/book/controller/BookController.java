package com.book.controller;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.book.dto.Book;
import com.book.dto.Customer;
import com.book.service.BookService;

@Controller
public class BookController {
	
	@Autowired
	BookService bservice;
	
	@GetMapping("/bookAll")
	public String bookAll(Model m) {
		List<Book> bList = bservice.bookAll();
		m.addAttribute("bookAll", bList);
		return "book/bookAll";
	}
	
	@GetMapping("/customerAll")
	public String customerAll(Model m) {
		List<Customer> cList = bservice.customerAll();
		m.addAttribute("customerAll", cList);
		return "book/customerAll";
	}
	
	@GetMapping("/searchOrders")
	public String searchOrdersform() {
		return "book/searchOrdersform";
	}
	@PostMapping("/searchOrders")
	public String searchOrders(@DateTimeFormat(pattern = "yyyy-MM-dd") Date startdate, @DateTimeFormat(pattern = "yyyy-MM-dd") Date enddate, String name, Model m) {
		if(name == null) {
			m.addAttribute("startdate", startdate);
			m.addAttribute("enddate", enddate);
			List<Map<String, Object>> list = bservice.searchOders(startdate, enddate);
			m.addAttribute("list", list);
			m.addAttribute("size", list.size());
		}else {
			m.addAttribute("name", name);
			List<Map<String, Object>> list = bservice.searchOdersName(name);
			m.addAttribute("list", list);
			m.addAttribute("size", list.size());
		}			
		return "book/searchOrders";
	}
}
