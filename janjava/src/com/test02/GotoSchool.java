package com.test02;

public class GotoSchool {

	public static void main(String[] args) {
		Bus b100 = new Bus("100번", 1000);
		Bus b200 = new Bus("200번", 2000);
		Subway line2 = new Subway("2호선", 1250);
		
		Student s1 = new Student("Jerry", 1, 10000);
		Student s2 = new Student("Tom", 2, 15000);
		
		s1.takeSubway(line2);
		s1.takeBus(b100);
		s1.showMoney();
		
		s2.takeBus(b200);
		s2.showMoney();
		
		line2.showInfor();
		b100.showInfo();
		b200.showInfo();

	}

}
