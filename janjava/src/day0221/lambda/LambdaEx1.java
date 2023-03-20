package day0221.lambda;

@FunctionalInterface // 람다로 구현할 수 있는 인터페이스
interface MyFunction {
	void run();
}

@FunctionalInterface
interface MyNumber {
	int max(int x, int y);
}

public class LambdaEx1 {
	public static void main(String[] args) {

		MyFunction f1 = () -> System.out.println("f1.run()실행");// 구현 객체 생성
		MyNumber n1 = (x, y) -> {
			if (x >= y) {
				return x;
			} else {
				return y;
			}
		};

		f1.run();
		System.out.println(n1.max(10, 12));
	} 

}