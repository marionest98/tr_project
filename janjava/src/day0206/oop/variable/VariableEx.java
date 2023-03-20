package day0206.oop.variable;

public class VariableEx {

	int iv; // 인스턴스 변수
	static int cv; // 클래스 변수
	
	void method() { // 메서드
		int lv = 0; // 지역 변수
	}
	
	public static void main(String[] args) {
		System.out.println(VariableEx.cv); //클래스명.클래스변수명
		System.out.println(cv); //같은 클래스 안이라면 생략 가능
		//인스턴스 멤버를 사용하려면 클래스를 객체로 생성
		VariableEx ve = new VariableEx();
		System.out.println(ve.iv);//참조변수.인스턴스변수명
		VariableEx ve2 = new VariableEx();
		ve2.iv = 10;
		System.out.println(ve.iv);//참조변수.인스턴스변수명
		System.out.println(ve2.iv);//참조변수.인스턴스변수명
		
		ve.method();
		
		
		
	}

}
