package day0214.exception;

import java.util.Scanner;

public class ThrowsEx {
	
	public void gugudan(String str) throws NumberFormatException {
		int num = Integer.parseInt(str);//숫자만!!
		for (int i = 2; i < 10; i++) {
			System.out.printf("%d * %d = %d ",num,i,num*i);
		}
	}
	public void getNumber(String str) throws Exception{
		String s = str.substring(0, 1);
		gugudan(s);
		// 런타임예외는 예외처리를 하지 않아도 컴파일 오류가 발생하지 않음
		//(자동적으로 throws처리가 된다.)
	}

	public static void main(String[] args) {
		ThrowsEx te = new ThrowsEx();
		Scanner scanner = new Scanner(System.in);
		System.out.println("구구단 숫자 입력 > ");
		String s = scanner.next();
		try {
			te.getNumber(s);
			//throws가 RuntimeException타입이 아닌 메서드 호출시
			//반드시 예이처리하면서 호출해야 한다.
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		

	}

}
