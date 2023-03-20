package day0208.oop.inheritance;

public class Dog extends Animal {
	void bark() {
		System.out.println("멍멍");
	}

	@Override
	void move() {
		System.out.println("4발로 뛰어갑니다.");
	}
}
