package day0119.variable.primitive;

public class PrimitiveEX {
	public static void main(String[] args) {
	//변수 선언 = 값;
		int age;
		age = 10;
		System.out.println(age);
		boolean bool = true;
		System.out.println("bool : "+bool);
		//영문 - 아스키 코드
		char c1 = 'A';
		char c2 = 65;
		System.out.println("c1 : "+c1);
		System.out.println("c2 : "+c2);
		//한글 - 유니코드(utf-8)
		char c3 = '가';
		char c4 = '\uAC00';
		System.out.println("c3 : "+c3);
		System.out.println("c4 : "+c4);
		
		//리터럴 정수 => int
		//int의 범위를 넘어가면 long으로 자동 바뀌는 것이 아니라 error 발생
		//long i = 21000000000; -> error
		//int의 범위를 넘은 리터럴 정수에 접미사 L을 붙여준다
		//해당 데이터는 long타입이라고 명시
		long i = 21000000000L;
		System.out.println(i);
		//변수에 저장될때는 2진수로
		int num = 10; // 10진수
		int bNum = 0B1010; // 2진수
		int oNum = 012; // 8진수
		int hNum = 0XA; // 16진수
		//변수에 저장된 값을 꺼내와 출력시 10진수로 출력
		System.out.println("10진수 : "+num);
		System.out.println("2진수 : "+bNum);
		System.out.println("8진수 : "+oNum);
		System.out.println("16진수 : "+hNum);
		
		double d = 3.14;
		//실수형 리터럴 -> double
		//실수형 리터럴 뒤에 접미사 F를 붙여주면 float타입 데이터가 된다
		float f = 3.14F;
		
		System.out.println(d);
		System.out.println(f);
		
		float f1 = 0.10000000001F;
	    double d1 = 0.10000000001;
	    
	    System.out.println("f1 : "+f1);
		System.out.println("d1 : "+d1);
		//float는 7자리 정도 double은 15자리 정도
		
		var mon = "Jan"; // => String mon = "Jan";
		var day = 19; // => int day = 19;
		System.out.println(mon+day);
	}

}
