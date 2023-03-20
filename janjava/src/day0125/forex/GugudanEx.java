package day0125.forex;

import java.util.Scanner;

public class GugudanEx {

	public static void main(String[] args) {
		// 1~9사이의 값을 입력 받아 구구단을 출력한다.
		System.out.print("1 ~ 19사이의 정수 입력 > ");
		Scanner scanner = new Scanner(System.in);
		int dan = scanner.nextInt();

		for (int i = 1; i <= 19; i++) {
			System.out.printf("%d * %d = %d \n", dan, i, (dan * i));
		}

	}

}
