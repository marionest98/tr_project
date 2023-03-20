package day0126.breakcon;

import java.util.Scanner;

public class BreakContinueEx2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		newgame: while (true) {
			int answer = (int) (Math.random() * 10) + 1;// 1~10사이 랜덤값 발생
			while (true) {
				System.out.print("1~10 사이의 숫자를 맞춰보세요 > ");
				int input = scanner.nextInt();

				if (input == answer) {
					System.out.println("맞췄습니다!!");
					System.out.print("다시하시겠습니까? (Y/N)");
					while (true) {
						char yn = scanner.next().charAt(0);
						if (yn == 'Y' || yn == 'y') {
							System.out.println("게임을 다시 시작합니다.");
							continue newgame;
						} else if (yn == 'N' || yn == 'n') {
							System.out.println("게임이 종료되었습니다.");
							break newgame;
						} else {
							System.out.println("Y 또는 N을 입력해 주세요 > ");
						}
					}//while 재시작 할지 확인
				} else {
					System.out.println("틀렸습니다. 다시!!");
				}
			} // while 게임
		} // while newgame
	}// main
}// class
