package day0119.variable.primitive;

public class ConversionEx4 {
	public static void main(String[] args) {
		// 4byte미만의 계산은 int로 바꿔서 계산한다
		short s = 10;
		short s2 = 20;
		
		short s3 = (short)(s + s2);
		
		System.out.println(" s + s2 = "+ s3);
		
		char c = 'A';
		System.out.println(c + 1);
		char c1 = (char)(c + 1);
		System.out.println(c1);
	}

}
