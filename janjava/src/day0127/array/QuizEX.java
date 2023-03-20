package day0127.array;

import java.util.Scanner;

public class QuizEX {
	public static void main(String[] arge) {
		String[][] word = {{"student","학생"},{"computer","컴퓨터"},{"Integer","정수"}};
		
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i < word.length; i++) {
			System.out.printf("Quiz%d. %s의 뜻은?", i+1, word[i][0]);
			String answer = scanner.next();
			
			if(answer.equals(word[i][1])) {
				System.out.println("정답입니다.");
			}else {
				System.out.println("틀렸습니다. 뜻은 "+ word[i][1]+" 입니다.");
			}//if
		}//for
	}//main

}//class
