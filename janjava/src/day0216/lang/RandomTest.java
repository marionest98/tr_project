package day0216.lang;

import java.util.Random;

public class RandomTest {
	
	public static void main(String[] args) {
		// 1~100사이의 정수 랜덤값
		// (int)(Math.random() * 범위) + 시작값
		
		int r1 = (int)(Math.random() * 100) + 1;
		System.out.println(r1);
		
		//java.util.Random클래스 - nextInt(범위) + 시작값;
		Random r = new Random();
		int r2 = r.nextInt(100)+1;
		System.out.println(r2);
		
		
	}

}
