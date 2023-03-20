package day0209.oop.modify;

class Card{	
	static int width = 100;
	static int height = 250;
	final int NUMBER;
	final String KIND;	
	public Card(int nUMBER, String kIND) {
		NUMBER = nUMBER;
		KIND = kIND;
	}
	@Override
	public String toString() {
		return "Card [NUMBER=" + NUMBER + ", KIND=" + KIND + "]";
	}		
}

public class FinalCard {
	public static void main(String[] args) {
		Card c1 = new Card(7,"HEART");
		System.out.println(c1);
		//참조변수 출력시 println(Object x)실행
		//println(Object x) => 주소값을 출력하는 것이 아니라
		//					   가리키고있는 객체의 toString() 호출, 리턴값 출력
		//Object타입의 매개변수로 모든 참조형타입을 출력할 수 있다.
		
		//c1.NUBER = 100; final상수는 값을 변경할 수 없다.
		Card c2 = new Card(10,"SPADE");
		System.out.println(c2.toString());
	}
}
