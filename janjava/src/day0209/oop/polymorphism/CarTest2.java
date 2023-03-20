package day0209.oop.polymorphism;

public class CarTest2 {

	public static void main(String[] args) {

		Car car = new Car();
		FireEngine fe = null;
		//FireEngine fe2 = new FireEngine();
		
		//car = fe2;
		
		fe = (FireEngine) car;// error
		fe.drive();
		fe.water();
		

	}

}
