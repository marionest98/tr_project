package day0119.variable.primitive;

public class ConversionEx1 {
	
	public static void main(String[] args) {
		int num1 = 2100000000;
		int num2 = 2100000000;
		
		System.out.println(num1 + num2); //오버 플로우 처리된 음수값이 출력됨
		System.out.println((long)num1 + num2); // 42억
		long num3 = num1 + num2; 
		//int가 자동으로 long타입으로 변하지 안아 -94967296으로 오버플로우된 값을 
		//long 타입으로 바꾸는것이기에 long타입의 -94967296가 된다
		//long num4 = (long)(num1 + num2);도 마찬가지
		System.out.println(num3);
		
	}
}