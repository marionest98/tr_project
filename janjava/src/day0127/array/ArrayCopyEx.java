package day0127.array;

import java.util.Arrays;

public class ArrayCopyEx {

	public static void main(String[] args) {
		int[] i1 = {1,2,3,4,5};
		int[] copy = new int[5];
		//System.arraycopy(복사할 배열, 시작인덱스, 복사받을 배열, 시작인덱스, 복사할 데이터의 수);
		System.arraycopy(i1, 1, copy, 0, 3);
		System.out.println(Arrays.toString(copy));
		
		int[] copy2 = i1.clone();
		System.out.println(Arrays.toString(copy2));
		copy2[4] = 10;
		System.out.println(Arrays.toString(i1));
		System.out.println(Arrays.toString(copy2));
		
	}

}
