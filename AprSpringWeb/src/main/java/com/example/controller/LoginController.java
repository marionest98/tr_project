package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.example.command.LoginDto;
import com.example.service.LoginService;

import jakarta.validation.Valid;

@SessionAttributes("user")
@Controller
public class LoginController {
	
	@Autowired
	LoginService service;
	
	@ModelAttribute("user")
	public LoginDto getLoginDto() {
		//System.out.println("getLoginDto()실행");
		return new LoginDto();
	}
	
	@GetMapping("/loginForm")
	public String form() {
		return "login/loginForm";
	}
	
	@RequestMapping("/login")
	public String  login(@Valid LoginDto dto, BindingResult result, Model m) {
		if(result.hasErrors()) {
			return "login/loginForm";
		}
		
		String dbpw = service.login(dto.getUserid());
		
		if(dbpw == null) {
			result.reject("nocode", "아이디 틀림"); //글로벌 에러 추가
			return "login/loginForm";
		}else if(dbpw != null && !dbpw.equals(dto.getPassword())) {
			result.reject("nocode", "비밀번호 틀림");
			return "login/loginForm";
		}else if(dbpw.equals(dto.getPassword())) {
			m.addAttribute("user", dto);
		}		
		
		return "login/login";
	}
	
	@GetMapping("/logout")
	public String logout(SessionStatus status) {
		status.setComplete();
		return "redirect:/";
	}
	
	//@ModelAttribute("user") : session에 user라는 이름으로 저장된 데이터 가져옴
	@GetMapping("/checklogin")
	public String check(@ModelAttribute("user") LoginDto dto) {
		if(dto.getUserid() !=null) {
			return "login/logincheck";
		}else {
			return "redirect:/loginForm";
		}
	}

}
