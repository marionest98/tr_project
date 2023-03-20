package day0120.operator;

public class OperatorEx4 {
	public static void main(String[] args) {
		int a = 10;
		int b = 11;
		
		boolean result = (a < b) || (a+=5) == b;
		
		System.out.println(a);
		System.out.println(result);
		boolean result2 = !(a < b) || (a+=5) == b;
		System.out.println(a);
		System.out.println(result2);

	}

}
