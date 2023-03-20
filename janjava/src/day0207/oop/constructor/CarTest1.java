package day0207.oop.constructor;

public class CarTest1 {

	public static void main(String[] args) {
		
		Car c1 = new Car();
		//c1.color = "white";//별도의 초기화 과정이 필요함
		//c1.gearType = "auto";
		//c1.door = 4;
		
		System.out.println(c1.toString());
		
		Car c2 = new Car("red", "manual", 2);
		System.out.println(c2.color+" "+c2.gearType+" "+c2.door);
		System.out.println(c2.toString());
		
		Car c3 = new Car(c2);
		System.out.println(c3.toString());
		
		
		
	}

}
