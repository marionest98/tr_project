<%@ page contentType="application/json; charset=UTF-8"%>
<%@ page import="java.util.*,com.google.gson.Gson"%>
<%
	List<String> list1 = new ArrayList<>();
	list1.add("apple");
	list1.add("banana");
	list1.add("calamansi");
	
	List<String> list2 = new ArrayList<>();
	list2.add("durian");
	list2.add("eggplant");
	list2.add("fig");
	
	List<List<String>> list3 = new ArrayList<>();
	list3.add(list1);
	list3.add(list2);
	
	//javaObject -> JSON
		Gson gson = new Gson();
		String json = gson.toJson(list3);
		
	out.print(json);
%>