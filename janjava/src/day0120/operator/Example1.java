package day0120.operator;

public class Example1 {

	public static void main(String[] args) {
		int numOfApple = 123;  // 총 사과의 수
		int sizeOfBucket = 10; // 바구니에 담을 수 있는 사과의 수
							   // 한 바구니에 10개씩 담을 수 있음
		
		// 모든 사과를 담는데 필요한 바구니의 수를 구하고 출력하세요
		int numOfBucket = numOfApple/sizeOfBucket + (numOfApple %sizeOfBucket > 0 ? 1 : 0);
		System.out.println("필요한 바구니의 수 : "+ numOfBucket + "개");

	}

}
