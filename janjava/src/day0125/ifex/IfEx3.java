package day0125.ifex;

import java.util.Scanner;

public class IfEx3 {

	public static void main(String[] args) {
		//입력 값이 4의 배수라면 "4의 배수"출력
		//아니면 "4의 배수 아님"출력
		Scanner scanner = new Scanner(System.in);

		System.out.println("정수 입력 >");
		int num = scanner.nextInt();
		if (num%4 == 0) {
			System.out.println(num+"은/는 4의 배수");
		}
		else {
			System.out.println(num+"은/는 4의 배수 아님");
		}

	}

}
