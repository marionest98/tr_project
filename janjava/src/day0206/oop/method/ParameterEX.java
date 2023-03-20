package day0206.oop.method;

public class ParameterEX {

	static void change(int x) {// primitive
		x = 1000;
		System.out.println("x : " + x);
	}

	static void change2(Data d) {// 참조형 - Data클래스로 생성한 객체의 주소값을 저장
		d.x = 1000;
		System.out.println("d.x : " + d.x);
	}

	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;

		change(d.x);
		System.out.println("d.x : " + d.x);

		change2(d);
		System.out.println("d.x : " + d.x);

	}

}
