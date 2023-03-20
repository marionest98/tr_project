package day0206.oop.method;

public class MethodEx {
	// int, long 타입의 값을 받아 더하고 리턴하는 add메서드
	// 리턴타입 이름(타입 변수명,...) {
	// 수행문;
	// return 값;
	// }
	long add(int i, long l) {
		return i + l;
	}

	// int, int값을 받아 빼고 결과를 리턴하는 subtract
	int subtract(int i, int i1) {
		return i - i1;
	}

	// int, int값을 받아 곱하고 결과를 리턴하는 multiply
	int multiply(int i, int i1) {
		return i * i1;
	}

	// double, double값을 받아 나누고 결과를 리턴하는 divide
	double divide(double d, double d1) {
		return d / d1;
	}

	// 두개의 문자열 받아서 더해서 출력 후 결과를 리턴하지 않는 addString메서드
	void addString(String s, String s1) {
		System.out.println(s + s1);// 메서드 호출은 메서드 안에서 한다.
		// if(조건) return;
		System.out.println();
	}

	public static void main(String[] args) {
		// add 메서드에 10, 20을 입력해 리턴값을 출력하세요
		MethodEx me = new MethodEx();
		long result = me.add(10, 20);
		System.out.println(result);
		System.out.println(me.subtract(10, 5));
		me.addString("hello", "java");//return값이 없기에 그냥 호출해서 사용

	}

}
