package com.example.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.dto.Dept;

@Mapper
public interface DeptDao {	
	
	//select 리턴타입 resultType 매개변수 parameterType 
	@Select("select * from dept order by deptno")
	public List<Dept> deptAll();
	
	@Select("select * from dept where deptno = #{deptno}")
	public Dept deptOne(int deptno);
	
	//insert,update,delete 리턴타입 int
	@Insert("insert into dept (deptno, dname, loc) values(#{deptno},#{dname},#{loc})")
	public int addDept(Dept dept);
	
	@Select("select max(deptno)+10 as max from dept")
	public int nwDeptno();
	
	public int updateDept(Dept dept);//동적 sql(if등)을 사용시에는 어노테이션을 사용할수없음
	
	@Delete("delete from dept where deptno=#{deptno}")
	public int delDept(int deptno);
	
	@Select("select * from dept where dname like concat('%', #{search},'%')")
	public List<Dept> searchDname(String search);
}
