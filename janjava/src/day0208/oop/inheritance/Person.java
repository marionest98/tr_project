package day0208.oop.inheritance;

public class Person extends Animal {
	void speak() {
		System.out.println("말한다.");
	}
	@Override //어노테이션. 현재 메서드가 오버라이딩된 메서드라고 알려줌
	void move() {
		System.out.println("걸어서 이동한다.");
	}//오버라이딩
}
