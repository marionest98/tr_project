package day0120.operator;

import java.util.Scanner;

public class OperatorEx8 {

	public static void main(String[] args) {
		//입력값이 양수 / 0/ 음수인지 알려주는 프로그램 구현
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("갑(정수) 입력>");
		
		int num = scanner.nextInt();
		String str = num > 0 ? "양수" : num == 0 ? "0" : "음수";
		
		System.out.printf("%d은/는 %s입니다.",num,str);

	}

}
