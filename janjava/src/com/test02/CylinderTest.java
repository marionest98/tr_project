package com.test02;

public class CylinderTest {

	public static void main(String[] args) {
		//Circle ci = new Circle(2.8);
		Cylinder cy = new Cylinder(new Circle(2.8), 5.6);
		
		System.out.printf("원통의 부피 : %.3f",cy.getVolume());
	}
}
