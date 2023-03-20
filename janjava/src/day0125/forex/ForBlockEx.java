package day0125.forex;

public class ForBlockEx {

	public static void main(String[] args) {
		//for문의 영역 - 특정 영역 내 선언된 변수는 영역이 끝나면 소멸된다.
		//          - 영역을 벗어나면 사용할수 없음
		int i = 0;
		for(i = 0; i <= 10; i++) {
			System.out.println(i);//밖에서 선언된 변수는 안에서 사용할 수 있다.
		}
		System.out.println(i);

	}

}
