package day0209.oop.modify;

abstract class Animal2{
	
	abstract void move();//조금씩 다르게 구현
	void eat() {System.out.println("먹는다");} //모든 sub에서 똑같이 사용
	
}

class Person extends Animal2{ // 일반 클래스에서 추상클래스 상속
	@Override
	void move() { // 상속받은 추상 메서드 오버라이딩 (무조건!!)
		System.out.println("걸어간다.");
	}	
	
}

class Bird extends Animal2{//Bird - 날아다닌다.
	@Override
	void move() {
		System.out.println("날아디닌다.");		
	}
	
}

public class AbstractTest {

	public static void main(String[] args) {
		//Animal2 a = new Animal2(); 추상클래스 객체 생성 X
		Person p = new Person();
		p.move();
		p.eat();
		Bird b = new Bird();
		b.move();
	}

}
