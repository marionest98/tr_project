package day0214.exception;

public class ThrowEX {
	public static void main(String[] args) {
		try {
			throw new Exception("강제 예외 발생");
		} catch (Exception e) {
			System.out.println("예외처리 : " + e.getMessage());
			e.printStackTrace();
		}

	}

}
