package ncs.test1;

import java.util.Random;
import java.util.Scanner;

public class Baseball {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n1 = 0;
		int n2 = 0;
		int n3 = 0;

		do {
			n1 = new Random().nextInt(9) + 1;
			n2 = new Random().nextInt(9) + 1;
			n3 = new Random().nextInt(9) + 1;
		} while (n1 == n2 | n1 == n3 | n2 == n3);
		
		int s1 = 0;
		int s2 = 0;
		int s3 = 0;
		
		while(true) {
			System.out.println("첫번째 숫자");
			s1 = s.nextInt();
			System.out.println("두번째 숫자");
			s2 = s.nextInt();
			System.out.println("세번째 숫자");
			s3 = s.nextInt();
			
			int strike = 0;
			int ball = 0;
			
			if(n1 == s1) {
				strike++;
			}else if(s1 == n2 || s1 == n3) {
				ball++;
			}
			if(n2 == s2) {
				strike++;
			}else if(s2 == n1 || s2 == n3) {
				ball++;
			}
			if(n3 == s3) {
				strike++;
			}else if(s3 == n2 || s3 == n1) {
				ball++;
			}
			if(strike == 3) {
				System.out.println("정답!! - "+ n1 + n2 + n3);
				break;
			}else {
				System.out.println(strike+" strike, "+ball+" ball");
			}
			
			
		}

	}

}
