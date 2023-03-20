package day0125.forex;

public class ForEx2 {

	public static void main(String[] args) {
		/*for(시작점; 끝나는 지점; 증감) {
			true일때 반복할 문장;*/
		// 1 ~ 10 하나씩 증가하면서 반복
		for(int i = 1; i <= 10; i++) {
			System.out.print(i+"\t");
		}
		System.out.println();
		//0 ~ 9까지 10번 반복
		for(int i = 0; i <= 9; i++) {
			System.out.print(i+"\t");// \t : tap공백
		}
		System.out.println();
		//0 ~ 9까지 4번 반복
		for(int i = 0; i <= 9; i+=2) {
			System.out.print(i+"\t");
		}
		System.out.println();
		//10 ~ 1까지 10번 반복
		for(int i = 10; i >= 1; i--) {
			System.out.print(i+"\t");
		}
		System.out.println();
		int j = 0;
		for(;j < 5;) {//초기식 과 증감식을 생략할 수 있다.
			j++;
			System.out.println(j);
		}
		//초기식과 증감식이 둘 이상 있는 for문도 가능하다.
		for(int i = 0, k = 100; i < 50 && k > 50; i++, k--) {
			System.out.println(i + " : "+k);
		}

	}

}
