package day0127.oop;

public class Tv {
	int channel;//값을 명시하지 않으면 기본값을 저장
	boolean power;
	String color;
	
	
	public Tv() {}

	public Tv(int channel, boolean power, String color) {
		this.channel = channel;
		this.power = power;
		this.color = color;
	}

	void power() {
		power = !power;
	}

	void chUp() {
		channel++;
	}

	void chDown() {
		channel--;
	}

}
