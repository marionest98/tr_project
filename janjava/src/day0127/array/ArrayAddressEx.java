package day0127.array;

import java.util.Arrays;

public class ArrayAddressEx {
	//실행시 argument에 hello world 두개 입력!!
	public static void main(String[] args) {
		String[] arr = args;// 배열의 주소값을 꺼내와서 저장
		
		System.out.println(Arrays.toString(args));
		System.out.println(Arrays.toString(arr));
		
		arr[0] = "hi";
		
		System.out.println(Arrays.toString(args));
		System.out.println(Arrays.toString(arr));

	}

}
