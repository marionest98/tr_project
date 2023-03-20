package day0214.exception;

public class ExceptionEx3 {

	public static void main(String[] args) {
		String[] str = { "abc", null };
		try {
			for (String s : str) {
				System.out.println(s.toUpperCase());
				// toUpperCase() : String클래스에 선언된 메서드.
				// : 문자열을 대문자로 바꿔서 리턴함
			}

		} catch (NullPointerException ne) {
			System.out.println("객체 없음." + ne.getMessage());
		}
		// NullPointerException : 사용할 객체가 실제로 없는데(주소값이 null)
		// 타입에 선언된 멤버를 사용하는 경우 발생

		for (String s : str) {
			if (s != null) {
				System.out.println(s.toUpperCase());
			}

		}

	}

}
