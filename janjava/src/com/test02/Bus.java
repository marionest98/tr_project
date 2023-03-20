package com.test02;

public class Bus {
	String busNumber;
	int charge;
	int income;
	int count;
	
	public Bus(String busNumber, int charge) {
		this.busNumber = busNumber;
		this.charge = charge;
	}
	
	public void take() {
		income += charge;
		count++;
		System.out.println("승객이 버스에 탑승.");
	}
	public void showInfo() {
		System.out.println("승객 수 : "+count+" 버스 수입 : "+income);
	}
	
	
	
	

}
