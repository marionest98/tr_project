package day0207.oop.method;

public class FactorialTest {

	static long factorial(int n) {
		long result = 0;

		if (n == 1) {
			result = 1;
		} else {
			result = n * factorial(n - 1);
		}
		return result;
	}

	public static void main(String[] args) {
		long r = factorial(3);
		System.out.println(r);
	}

}
