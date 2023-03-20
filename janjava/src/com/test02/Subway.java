package com.test02;

public class Subway {
	String lineNumber;
	int count;
	int income;
	int charge;
	
	public Subway(String lineNumber, int charge) {
		this.lineNumber = lineNumber;
		this.charge = charge;
	}
	
	public void take() {
		income += charge;
		count ++;
		System.out.println("지하철에 승객이 탑승.");
	}
	public void showInfor() {
		System.out.println("승객 수 : "+count+" 수입액 : "+income);
	}
	

}
