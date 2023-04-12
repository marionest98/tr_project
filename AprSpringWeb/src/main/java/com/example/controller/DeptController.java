package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.dao.DeptDao;
import com.example.dto.Dept;
import com.example.service.DeptService;

@Controller
public class DeptController {
	
	@Autowired
	DeptService dservice;
	
	@GetMapping("/deptAll")
	public String deptAll(Model m) {
		List<Dept> dList = dservice.deptAll();
		m.addAttribute("deptAll", dList);
		
		return "dept/detpAll";
	}
	
	@GetMapping("/add")
	public String form(Model model) {
		int nwDeptno = dservice.nwDeptno();
		model.addAttribute("nw", nwDeptno);
		return "dept/form";
	}
	
	@PostMapping("/add")
	public String add(DeptDao dao) {
		
		return "dept/addresult";
	}
	
}
