package day0209.oop.polymorphism;
class Car{
	String color;
	int speed;
	
	public void drive() {
		System.out.println("drive~~~");
	}
	public void stop() {
		System.out.println("stop!!");
	}
}

class FireEngine extends Car{
	
	FireEngine(){
		super();
	}
	
	public void water() {
		System.out.println("water~~~~");
	}
	
}


public class CarTest1 {
	public static void main(String[] args) {
		
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		car = fe;//car = (Car) fe;
		car.drive();
		//car.water(); // error. 객체 안에는 water()가 있지만
					   //        Car타입의 변수가 사용할 수 없음(상속한 멤버 아님)
		
		fe2 = (FireEngine) car;
		
		fe2.drive();
		fe2.water();
		
	}

}
