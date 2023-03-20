package day0120.operator;

public class OperatorEx6 {
	public static void main(String[] args) {
		int i = 10;
		//i++; 이런 형태로 단돈으로 사용하는 경우가 많음
		System.out.println(++i); //문장 내 우선순위 : 1
		System.out.println(i++); //문장 내 우선순위 : 제일 마지막(출력보다 나중)
		
		System.out.println(i);
		
		int j = 10;
		int n = j++%5;
		
		System.out.println(j);
		System.out.println(n);

	}

}
