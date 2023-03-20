package day0206.oop.method;

public class ParameterEX2 {
	static void chage(int[] x) {// reference - 배열의 주소값
		x[0] = 1000;
		System.out.println("x[0] : " + x[0]);
	}

	public static void main(String[] args) {

		int[] x = { 10 };
		System.out.println("x[0] : " + x[0]);

		chage(x);
		System.out.println("x[0] : " + x[0]);

	}

}
