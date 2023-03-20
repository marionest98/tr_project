package day0126.whileex;

import java.util.Scanner;

//1.증속 2.감속 3.중지
public class WhileEx2 {

	public static void main(String[] args) {
		int speed = 0;
		boolean run = true; // 차 : 시동이 켜진 상태-true / 시동 중지-false
		
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("----------------");
			System.out.println("1.증속 2.감속 3.중지");
			System.out.println("----------------");
			System.out.print("선택(1,2,3) : ");
			
			int code = sc.nextInt();
			if(code == 1) {
				speed++;
				System.out.println("현재 속도 : "+speed);
			}else if(code == 2) {
				speed--;
				if(speed < 0) {//스피드가 0보다 작으면 0으로 바꿔 주세요
					speed = 0;
				}
				System.out.println("현재 속도 : "+speed);
			}else if(code == 3) {
				speed = 0;
				run = false;//while문 종료
				System.out.println("중지\n현재 속도 : "+speed);
			}else {
				System.out.println("다른값을");
			}
			
			
		}
		

	}

}
