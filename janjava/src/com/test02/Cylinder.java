package com.test02;

public class Cylinder {
	private Circle circle;
	private double height;
	
	public Cylinder(Circle circle, double height) {
		this.circle = circle;
		this.height = height;
	}

	public double getVolume() {
		return circle.getArea()*height;
	}
}
