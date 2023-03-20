package com.test02;

public class Circle {
	private double radius;
	private static final double PI = 3.14;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return radius*radius*PI;
	}
	
	

}
