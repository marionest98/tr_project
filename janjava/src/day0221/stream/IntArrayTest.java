package day0221.stream;

import java.util.Arrays;

public class IntArrayTest {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };

		int sumValue = Arrays.stream(arr).sum();
		int count = (int) Arrays.stream(arr).count();
		System.out.println("총합 : " + sumValue);
		System.out.println("갯수 : " + count);

		int sumValue2 = Arrays.stream(arr).reduce(0, (a, b) -> a + b);
		System.out.println("총합2 : " + sumValue2);
	}

}
