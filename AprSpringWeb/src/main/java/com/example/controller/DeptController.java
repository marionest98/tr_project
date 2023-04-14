package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
	
	@GetMapping("/update/{deptno}")
	public String updateform(@PathVariable int deptno, Model m) {
		m.addAttribute("deptno", deptno);
		return "dept/updateform";
	}
	
	@PutMapping("/update")
	public String update(Dept dept) {
		dservice.updateDept(dept);
		return "redirect:/";
	}
	
	@RequestMapping("/delete/{deptno}")
	public String delete(@PathVariable int deptno) {
		dservice.delDept(deptno);
		return "redirect:/";
	}
	
	@GetMapping("/add")
	public String form(Model model) {
		int nwDeptno = dservice.nwDeptno();
		model.addAttribute("nw", nwDeptno);
		return "dept/form";
	}
	
	@PostMapping("/add")
	public String add(Dept dept, Model m) {
		int x = dservice.addDept(dept);
		if(x == 0) {
			m.addAttribute("msg", "부서정보가 입력되지 않았습니다.");
		}
		return "dept/addresult";
	}
	
	@GetMapping("/search")
	public String searchform() {		
		return "dept/searchForm";
	}
	
	@PostMapping("/search")
	public String search(String search, Model m) {
		m.addAttribute("search", search);
		List<Dept> list = dservice.searchDname(search);
		m.addAttribute("list", list);
		m.addAttribute("size", list.size());
		return "dept/search";
	}
	
}
