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
	
	public List<Dept> deptAll(){
		return dao.deptAll();
	}
	
	public int nwDeptno() {
		return dao.nwDeptno();
	}
}
