package day0125.forex;

public class MultiForEx1 {

	public static void main(String[] args) {
		// 1~4까지 3번 반복

		for (int i = 0; i <= 2; i++) {
			System.out.println(i+1);
			for (int j = 1; j <= 4; j++) {
				System.out.println(" " + j);
			} // inner
			System.out.println("------");

		} // outer
		System.out.println("프로그램 종료");

	} //main

} //class
