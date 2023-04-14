package com.example.scott.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.scott.dao.EmpDao;
import com.example.scott.dto.Emp;

@Service
public class EmpService {
	
	@Autowired
	EmpDao dao;
	
	public List<Map<String,Object>> selectDept() {
		return dao.selectDept();
	};
	
	public List<Map<String,Object>> emps(int deptno) {
		return dao.emps(deptno);
	};
	
	public Emp emp(int deptno) {
		return dao.emp(deptno);
	};
	
	public List<Map<String,Object>> names(String ename) {
		return dao.names(ename);
	};

}
