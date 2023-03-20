package day0126.array;

import java.util.Arrays;

public class ArrayEx1 {

	public static void main(String[] args) {
		char[] ch = new char[3];  //char ch[]
		//배열의 크기는 한번 생성하면 고정된다.
		ch[0] = 'a';
		ch[1] = 'b';
		ch[2] = 'c';
		//ch[3] = 'd'; 배열의 범위가 넘어가면 error 발생
		
		for(int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
		//배열 생성과 초기화를 한번에!!
		int[] iarr = {1,2,3,4};
		for (int i = 0; i < iarr.length; i++) {
			System.out.println(iarr[i]);
		}
		
		int[] iarr2 = new int[] {10,20,30};
		for (int i = 0; i < iarr2.length; i++) {
			System.out.println(iarr2[i]);
		}
		
		//int[] test;
		//test = {1,2,3}; // {}사용 방법은 선언과 생성하는 부분이 다른 문장에 있으면 error 발생
		
		int[] test2;
		test2 = new int[] {20,40,60};
		
		System.out.println(Arrays.toString(ch));
		System.out.println(Arrays.toString(iarr));
		System.out.println(Arrays.toString(iarr2));
		System.out.println(Arrays.toString(test2));
		
		//foreach : 집합데이터의 처음부터 마지막 데이터를 전부 꺼내온다.
		//for(변수 선언 : 집합데이터(배열, 컬렉션) ) {	수행문; }
		
		for (int a : iarr) {
			System.out.println(a);
		}
		for (char c : ch) {
			System.out.println(c);
		}

	}

}
