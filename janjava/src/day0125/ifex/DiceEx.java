package day0125.ifex;

import java.util.Scanner;

public class DiceEx {

	public static void main(String[] args) {
		//주사위 놀이(1~6)
		int a = (int)(Math.random()*6)+1;
		int b = (int)(Math.random()*6)+1;
		//a의 값이 b보다 더크다면 A가 이겼습니다.
		//b의 값이 a보다 더크다면 B가 이겼습니다.
		//같은 값이라면 A와 B가 비겼습니다.
		System.out.println("A : " + a + " : B : " + b);
		
		if( a > b ) {
			System.out.println("A승");
		}else if(b>a) {
			System.out.println("B승");
		}else if(a==b) {
			System.out.println("비김");
		}
		
		
		
		
		
		
		if (a>b) {
			System.out.println("A가 이겼습니다.");
		}else {
			if (b>a) {
			System.out.println("B가 이겼습니다.");
			}else {
				System.out.println("A와 B가 비겼습니다.");
			}
		} 

	}
}
