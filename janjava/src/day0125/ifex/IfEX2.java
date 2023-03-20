package day0125.ifex;

public class IfEX2 {
	
	public static void main(String[] args) {
		int score = 100;
		
		if(score >= 90) {
			System.out.println("점수가 90이상입니다");
			System.out.println("등급은 A입니다");
		}
		//if(score < 90) {
		else {
			System.out.println("점수가 90보다 작습니다");
			System.out.println("등급은 B입니다");
		}
		System.out.println("프로그램 종료");
	}

}
