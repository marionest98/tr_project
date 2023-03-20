package day0120.test.variable;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("밑변의 길이를 입력하세요 > ");
		double a = scanner.nextDouble();
				
	    System.out.println("높이의 길이를 입력하세요 > ");		
		double b = scanner.nextDouble();
		  
		System.out.printf("밑변 : %.1f\n높이 : %.1f\n삼각형의 크기 : %.1f", a, b, a*b/2);
		  

	}

}
