package com.test02;

public class Pen {
	private int amount;
	public int getAmount() { return amount; }
	public void setAmount (int amount) { this.amount = amount; }
}

class SharpPencil extends Pen { // 샤프펜슬
	private int width;
}

class Ballpen extends Pen { // 볼펜
	private String color; // 볼펜의 색
	public String getColor() { return color; }
	public void setColor(String color) { this.color = color; }
}

class FountainPen extends Ballpen { // 만년필
	public void refill (int n) { setAmount(n); }
}








