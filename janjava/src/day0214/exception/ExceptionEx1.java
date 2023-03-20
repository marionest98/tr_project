package day0214.exception;

public class ExceptionEx1 {

	public static void main(String[] args) {

		int[] iarr = { 10, 200, 30 };

		for (int i = 0; i <= iarr.length; i++) {
			try {
				System.out.println(1+i+"번 수행");
				System.out.println("iarr[" + i + "] : " + iarr[i]);
				System.out.println(1+i+"~~~~~~~~~~~~");
			} catch (Exception e) {//다형성 Exception 모든 예외
				System.out.println("예외발생 - 인덱스 범위가 맞지 않음");
				System.out.println(e.getMessage());
				e.printStackTrace();// 예외 추적 메서드
				return;//main메서드 종료
			}finally {
				System.out.println(1+i+"-finally");
			}
		}

		System.out.println("program end!!");

	}

}
