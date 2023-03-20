package day0206.oop.method;

public class StaticInstance {
	
	static int cv;
	int iv;
	
	int iv2 = cv;
	int iv3 = iv;
	// instane => static, instane 다 사용 가능 메서드도 마찬가지
	void instaneMethod() {
		System.out.println(iv);
		System.out.println(cv);
	}
	
	static int cv2 = cv; //static -> static만
	static void staticMethod() {
		//System.out.println(iv);
		StaticInstance si = new StaticInstance();
		System.out.println(si.iv);
	}
	

}
