package day0125.forex;

public class Game369 {

	public static void main(String[] args) {
		// 1부터 100까지 하나씩 증가하면서
		// 3, 6, 9가 들어있는 경우 "짝"이라고 출력
		// 그외 나머지는 숫자 그대로 출력

		for (int i = 1; i <= 100; i++) {
			// 10보다 작을 때 -> 3의 배수
			// 10 ~ 100사이 -> 십의 자리 3의 배수 || 일의 자리 3의 배수

			if (i < 10) {// 10보다 작을 때
				if (i % 3 == 0) {
					System.out.println("짝");
				} else {
					System.out.println(i);
				}
			} else {// 10 ~ 100사이
				if ((i / 10) % 3 == 0 && ((i % 10) % 3 == 0 && i % 10 != 0)) {
					System.out.println("짝짝");
				} else if ((i / 10) % 3 == 0 || ((i % 10) % 3 == 0 && i % 10 != 0)) {
					System.out.println("짝");
				} else {
					System.out.println(i);
				}
			}

			if (((i / 10 == 3) || (i / 10 == 6) || (i / 10 == 9)) && ((i % 10 == 3) || (i % 10 == 6) || (i % 10 == 9))) {
				System.out.println("짝짝!");
			} else if ((i / 10 == 3) || (i / 10 == 6) || (i / 10 == 9) || (i % 10 == 3) || (i % 10 == 6) || (i % 10 == 9)) {
				System.out.println("짝!");
			} else {
				System.out.println(i);
			}

		} // for

	}// main

}// class
