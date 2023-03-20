package day0119.variable.primitive;

public class ConversionEx3 {
	public static void main(String[] args) {
		
		double d = 100.9999; // 정수를 실수로
		int i = (int)d;      // 실수를 정수로 바꿔준다(소수점 자리는 버림한다)
		
		System.out.println("d : "+d);
		System.out.println("i : "+i);
		
	}

}
