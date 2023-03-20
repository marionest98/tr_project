package day0127.oop;

public class TvTest {
	public static void main(String[] args) {
		Tv t; // Tv타입의 변수 t선언. Tv클래스로 생성한 객체의 주소값 저장
		t = new Tv(); // new - 1. 메모리상에 새로운 주소를 할당받고 공간을 만든다.
					  //       2. 클래스에 선언된 멤버들을 인스턴스로 만든다.
		
		t.channel = 10;
		t.chUp();
		t.chUp();
		System.out.println("현재 채널은 : "+t.channel);

	}

}
