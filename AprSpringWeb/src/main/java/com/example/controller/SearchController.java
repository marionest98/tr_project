package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SearchController {
	
	@RequestMapping("/search/internal")
	public ModelAndView searchInternal(String query, @RequestParam("p") int pageNumber) {
		System.out.println("query=" + query + ",pageNumber=" + pageNumber);
		return new ModelAndView("search/internal");
		//ModelAndView("viewname")
		//ModelAndView("viewname", "model이름", model값)
	}
	@RequestMapping("/search/external")
	public ModelAndView searchExternal(String query, @RequestParam(value = "p", defaultValue = "1") int pageNumber) {
		System.out.println("query=" + query + ",pageNumber=" + pageNumber);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("search/external");// view name
		mav.addObject("query", query); //model 데이터 추가
		mav.addObject("p", pageNumber);
		return mav; //new ModelAndView("search/external");
	}
}
