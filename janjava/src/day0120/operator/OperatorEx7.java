package day0120.operator;

import java.util.Scanner;

public class OperatorEx7 {
	public static void main(String[] args) {
		int num = 100;
		
		String str = (num % 2 == 0) ? "짝수" : "홀수";
		
		System.out.printf("%d은/는 %s입니다\n",num, str);
		
		//스캐너를 이용해 입력한 값을 홀수/짝수 체크
		Scanner scanner = new Scanner(System.in);
		System.out.println("갑(정수) 입력>");
		int i = scanner.nextInt();
		String s = (i % 2 == 0) ? "짝수" : "홀수";
		
		System.out.printf("%d은/는 %s입니다",i, s);
	}

}
