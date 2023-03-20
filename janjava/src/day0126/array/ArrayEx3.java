package day0126.array;

import java.util.Arrays;

//최대값, 최소값
public class ArrayEx3 {

	public static void main(String[] args) {
		int[] age = { 67, 12, 33, 20, 24, 55, 87 };

		int max = age[0]; // 첫번째 값으로 초기화 후 사용
		int min = age[0];

		for (int i = 1; i < age.length; i++) {
			if (max < age[i]) {
				max = age[i];
			}
			if (min > age[i]) {
				min = age[i];
			}
		}
		System.out.println("나이가 제일 많은 사람은 나이는 " + max + "세 입니다.");
		System.out.println("나이가 제일 적은 사람은 나이는 " + min + "세 입니다.");
		

		System.out.println(Arrays.toString(age));
		Arrays.sort(age);//원본 배열 자체를 정렬(오름차순)
		System.out.println(Arrays.toString(age));
		
		System.out.println("최소 : "+ age[0]);
		System.out.println("최대 : "+ age[age.length-1]);
	}
}
