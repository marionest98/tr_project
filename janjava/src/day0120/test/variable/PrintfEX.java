package day0120.test.variable;

public class PrintfEX {
	public static void main(String[] args) {
		/*System.out.print("값");  //
		 System.out.println("값");//
		 System.out.printf("포맷형식","값1","값2","값3","..."); //format된 문자열 출력*/
		// 정수 - %d, 실수 - %f, 문자열 - %s, 16진수값 - %x, char - %c
		
		System.out.printf("전수 : %d,%d \n", 100, 200);
		System.out.printf("pie는 %f입니다\n", 3.141592);
		System.out.printf("pie는 %.2f입니다\n", 3.141592);
		System.out.printf("%s\n","hello");
		System.out.printf("%5s\n","ja");
		System.out.printf("%d\n", 123);
		System.out.printf("%5d\n", 123);
		System.out.printf("%05d\n", 123);
		
		System.err.println("빨강색으로 출력");
		
		
	}

}
