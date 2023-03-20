package day0120.operator;

public class OperatorEx5 {

	public static void main(String[] args) {
		int num1 = 12; // 0000 1100
		int num2 = 7;  // 0000 0111
		
		System.out.println(num1 & num2); //0000 0100
		System.out.println(num1 | num2); //0000 1111
		System.out.println(num1 ^ num2); //0000 1011
		
		System.out.println(num2 << 3); //0011 1000 32+16+8

	}

}
