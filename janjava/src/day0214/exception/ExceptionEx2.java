package day0214.exception;

public class ExceptionEx2 {

	public static void main(String[] args) {
		try {
			int i = 100;
			int n = Integer.parseInt(args[0]);
			System.out.println(i / n);
		
		} catch (ArrayIndexOutOfBoundsException | NumberFormatException ne) {
			System.out.println("숫자만 입력하세요.");
		} catch (ArithmeticException ae) {
			System.out.println("0으로 나눌 수 없습니다.");
		} catch (Exception e) {
			System.out.println("예외 발생");
		}

		// ArrayIndexOutOfBoundsException
		// NumberFormatException
		// ArithmeticException

	}

}
