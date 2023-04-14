package com.example.scott.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.scott.dto.Emp;
import com.example.scott.service.EmpService;
import com.google.gson.Gson;

@Controller
public class ScottController {
	
	@Autowired
	EmpService service;
	
	@GetMapping("/selectdept")
	public String selectDept(Model m) {
		List<Map<String,Object>> dList = service.selectDept();
		m.addAttribute("dList", dList);
		return "scott/emp";
	}
	
	@GetMapping("/emps/{deptno}")
	@ResponseBody
	public String emps(@PathVariable int deptno) {
		List<Map<String,Object>> emps = service.emps(deptno);
		
		Gson gson = new Gson();
		String elist = gson.toJson(emps);
		//System.out.println(elist);		
		return elist;
	}
	
	@GetMapping("/emp/{deptno}")
	@ResponseBody
	public String emp(@PathVariable int deptno) {
		Emp emp = service.emp(deptno);
		
		Gson gson = new Gson();
		String e = gson.toJson(emp);
		//System.out.println(e);		
		return e;
	}
	
	@GetMapping("/searchname")
	public String nameform() {
		return "scott/nameform";
	}
	
	@PostMapping("/searchname")
	public String names(String ename, Model m) {
		m.addAttribute("ename", ename);
		List<Map<String,Object>> names = service.names(ename);
		m.addAttribute("names", names);
		m.addAttribute("size", names.size());
		return "scott/names";
	}

}
