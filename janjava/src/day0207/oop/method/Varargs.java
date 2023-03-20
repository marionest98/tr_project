package day0207.oop.method;

public class Varargs {
	// ... : 가변 인수. 메서드 하나당 한번만 제일 마지막 변수에 적용할 수 있다.
	void addStr(int i,String... s) {//String 데이터 여러개 => 배열 처리
		String text = "";
		for(String str : s) {
			text += str;
		}
		System.out.println(text);
	}

	public static void main(String[] args) {
		Varargs v = new Varargs();
		v.addStr(1,"hello", "java");
		v.addStr(2,"variable","argument","test");

	}

}
