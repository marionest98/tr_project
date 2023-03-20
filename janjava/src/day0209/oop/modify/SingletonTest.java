package day0209.oop.modify;

class Singleton{
	private static Singleton s = new Singleton();//객체 생성 - 한번만!!
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		return s;
	}
	int x;
}

public class SingletonTest {

	public static void main(String[] args) {
		//Singleton s = new Singleton(); 외부에서 객체 생성X
		Singleton s1 = Singleton.getInstance();//이미 생성된 객체의 주소를 받아온다.
		s1.x = 10;
		Singleton s2 = Singleton.getInstance();
		System.out.println("s2.x : "+s2.x);
		System.out.println(s1==s2);//같은 개체를 가리키고 있음.
	}

}
