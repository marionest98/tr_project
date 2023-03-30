<%@ page contentType="application/json; charset=UTF-8"%>
<%@ page import="java.util.*,com.google.gson.Gson"%>
<%@ page import="data.person.Person"%>
<%
	Person p1 = new Person("김자바", 30, "여");
	Person p2 = new Person("이자바", 20, "남");
	Person p3 = new Person("김스프링", 10, "남");
	
	List<Person> list = new ArrayList<>();
	
	list.add(p1);
	list.add(p2);
	list.add(p3);
	
	Gson g = new Gson();
	out.print(g.toJson(list));
	
%>