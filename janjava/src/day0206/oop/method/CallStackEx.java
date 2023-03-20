package day0206.oop.method;

public class CallStackEx {
	
	public static void first() {
		System.out.println("first");
		second();//클래스명 생략
	}
	
	public static void second() {
		System.out.println("second");
	}

	public static void main(String[] args) {
		System.out.println("main");
		first();
		

	}

}
