package com.example.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.command.NewArticleCommand;

//GET : article/newArticle
//POST : article/newArticle

@Controller
@RequestMapping("/article/newArticle") //@RequestMapping(value="/article/newArticle")
public class NewArticleController {
	
	@GetMapping
	public String form() {
		return "article/newArticleForm"; 
		//요청처리 메서드에서 String 리턴시 : return값 = view name
	}
	
	@PostMapping
	public String submit(@ModelAttribute("command") NewArticleCommand article) {
		//1. DispatcherServlet이 NewArticleCommand객체 생성 - 매개변수에 전달
		//2. @~Mapping이 요청 파라미터값을 변수 명에 맞게 저장(setter)
		//3. DispatcherServlet이 생성한 객체는 전부 view로 전달됨(model)
		// 이름(key)을 지정하지 않으면 클래스명을 사용하되 첫글자는 소문자로 변경
		// @ModelAttribute을 사용해 model이름을 지정해 줄 수 있다
		System.out.println(article);
		return "article/newArticleSubmit"; 
		//요청처리 메서드에서 String 리턴시 : return값 = view name
	}
}
