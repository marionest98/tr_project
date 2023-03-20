package day0120.operator;

public class divisionEx {
	public static void main(String[] args) {
		
		int i = 100;
		//프로그래밍에서는 어떠한 숫자이든 0으로 나눌 수 없다		
		//int result1 = i / 0; // ArithmeticException
		//int result2 = i % 0;
		
		double d = 0.0;
		System.out.println(i / d); // Infinity(무한대)
		System.out.println(i % d); // NaN(Not a Number)
		//예외가 발생하진 않지만 Infinity, NaN에 연산시 Infinity, NaN이 나오기 때문에
		//그 뒤 연산은 필요가 없다
		

	}

}
