package day0207.oop.constructor;

public class Car {
	
	String color;
	String gearType;
	int door;
	
	Car(){
		this("white","auto",4);//기존 생성자와 같은일을하고 있다면
							   //코드를 재사용한다.
	}
	Car(Car c){
		this(c.color, c.gearType, c.door);
	}
	
	
	//지역변수와 인스턴스변수의 이름이 같은 경우..
	//선언된 영여내에서는 지역변수가 우선권을 가진다.
	//객체에 있는 인스턴스 변수를 가리키기 위해서는 객체의 주소값이 필요
	//this참조변수는 현재 객체의 주소값을 가지고 있다.
	Car(String color, String gearType, int d){// 인스턴스 변수의 값을 초기화
		this.color = color;
		//현재 생성한 객체 안에 있는 인스턴스 변수
		this.gearType = gearType;
		door = d;
	}
	//toString - 개체에 저장된 값(변수)들을 하나의 문자열로 만들어 리턴한다.
	public String toString() {
		return "Car - color:"+color+" gearType:"+gearType+" door:"+door;
	}


}
