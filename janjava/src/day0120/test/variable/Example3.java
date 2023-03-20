package day0120.test.variable;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		//제품명(name), 수량(count), 단가(price)를 입력받아
		//제품명과 총금액을 출력하세요
		//출력 결과 예시) 제품 : 마우스, 갯수 : 10개, 총금액 : 100000원
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("제품명>");
		String n = scanner.next();
		System.out.print("수량>");
		int c = scanner.nextInt();
		System.out.print("단가>");
		int p = scanner.nextInt();
		
		System.out.printf("제품명 : %s 수량 : %d개 단가 : %,d원\n총금액 : %,d원",n,c,p,c*p);
		
		
		

	}

}
