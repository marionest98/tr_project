package day0207.oop.method;

public class OverloadingEX {
	// int, int 받아서 더한 값을 리터하는 add
	int add(int a, int b) {
		System.out.println("int, int");
		return a + b;
	}
	// int, long 받아서 더한 값을 리턴하는 add
	long add(int a, long b) {
		System.out.println("int, long");
		return a + b;
	}
	// long, int 받아서 더한 값을 리턴하는 add
	long add(long a, int b) {
		System.out.println("long, int");
		return a + b;
	}
	// int[] 받아서 배열의 모든 값을 더하고 출력하는 add(리턴 없음)
	void add(int[] array) {
		int result = 0;

		for (int i : array) {
			result += i;
		}
		System.out.println("배열의 합 : "+result);
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };
		OverloadingEX ov = new OverloadingEX();
		int r1 = ov.add(10,20);
		System.out.println("r1 : "+r1);
		
		ov.add(arr);

	}

}
