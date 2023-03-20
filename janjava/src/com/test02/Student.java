package com.test02;

public class Student {
	
	String name;
	int grade;
	int money;
	
	

	Student(String name, int grade, int money) {
		this.name = name;
		this.grade = grade;
		this.money = money;
	}
	public void takeBus(Bus bus) {
		bus.take();
		money -= bus.charge;
		System.out.println(name+"이 "+bus.busNumber+" 버스에 탑승");
	}
	
	
	public void takeSubway(Subway subway) {
		subway.take();
		money -= subway.charge;
		System.out.println(name+"이 "+subway.lineNumber+" 지하철 탑승");
	}
	
	void showMoney() {
		System.out.println(name+"의 용돈이 "+money+"만큼 남았습니다.");
	}



	

}
