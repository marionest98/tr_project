package day0210.oop.interfaceex;

interface Inter1 {
	int A = 100; // public static final 생략

	int getA(); // public abstract 생략
}

public class InterfaceTest implements Inter1 {

	public static void main(String[] args) {
		Inter1 it = new InterfaceTest();
		System.out.println(it.getA());//오버라이딩 된 메서드 호출

	}

	@Override
	public int getA() {
		return A;
	}

}
