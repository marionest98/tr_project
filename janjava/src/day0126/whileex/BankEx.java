package day0126.whileex;

import java.util.Scanner;

public class BankEx {

	public static void main(String[] args) {
		// 키보드로 입력된 데이터로 예금, 출금, 조회, 종료의 기능을 제공하는 프로그램
		// 1.예금 2.출금 3.조회 4.종료 *.다시보기

		Scanner scanner = new Scanner(System.in);
		int m = 0;// 잔액

		while (true) {
			
			System.out.println("------------------------------");
			System.out.println("1.예금 2.출금 3.조회 4.종료 *.다시보기");
			System.out.println("------------------------------");
			System.out.println("선택 > ");
			char c = scanner.next().charAt(0);
			if (c == '1') {
				System.out.println("예금\n잔액: " + m);
				System.out.println("입금할 금액을 입력해주세요.");
				int money = scanner.nextInt();
				m += money;
				System.out.println("예금완료.");

			} else if (c == '2') {
				System.out.println("출금\n잔액: " + m);
				int money = scanner.nextInt();
				System.out.println("출금할 금액을 입력해주세요.");
				if (m - money >= 0) {
					m -= money;
					System.out.println("출금완료.");
				} else {
					System.out.println("잔액이 부족합니다.");
				}
			} else if (c == '3') {
				System.out.println("조회");
				System.out.println("잔액 : " + m);
			} else if (c == '*') {
			} else {
				System.out.println("종료");
				break;
			}
		} // while end

	}

}
