package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.DeptDao;
import com.example.dto.Dept;

@Service
public class DeptService {
	
	@Autowired
	DeptDao dao;
	
	public int addDept(Dept dept) {
		int x = dao.addDept(dept);
		return x;
	}
	
	public List<Dept> deptAll(){
		return dao.deptAll();
	}
	
	public int nwDeptno() {
		return dao.nwDeptno();
	}
	
	public void updateDept(Dept dept) {
		dao.updateDept(dept);
	}
	
	public void delDept(int deptno) {
		dao.delDept(deptno);
	}
	
	public List<Dept> searchDname(String search){
		return dao.searchDname(search);
	}
}
