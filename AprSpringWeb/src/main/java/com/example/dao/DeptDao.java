package com.example.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.dto.Dept;

@Mapper
public interface DeptDao {
	public List<Dept> deptAll();
	public Dept deptOne(int deptno);
	//insert,update,delete 리턴타입 int
	public int addDept(Dept dept);
	public int nwDeptno();
}
