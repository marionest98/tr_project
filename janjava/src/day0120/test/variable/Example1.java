package day0120.test.variable;

public class Example1 {
	public static void main(String[] args) {
		//변수 x에는 3, 변수 y에는 7이 저장되어있는데
		//x의 값을 y에, y의 값을 x에 바꿔서 저장하고 x,y에 저장된 값을 출력하세요.
		int x = 3;
		int y = 7;
		int temp = x;
		x = y;
		y = temp;
		System.out.printf("x : %d, y : %d",x,y);
		
	}

}
