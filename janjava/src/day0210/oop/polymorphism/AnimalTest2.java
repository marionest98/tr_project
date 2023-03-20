package day0210.oop.polymorphism;

public class AnimalTest2 {

	public static void main(String[] args) {
		Animal[] animals = {new Human(), new Eagle(), new Tiger()};
		//super타입으로 배열을 선언하면 sub객체들을 저장할 수 있다.
		for(int i = 0; i< animals.length; i++ ) {
			animals[i].move();//animal타입으로 꺼내옴 - 오버라이딩 된 메서드 호출
			Animal a = animals[i];
			if(a instanceof Human) {
				((Human)a).readBook();
			}else if(a instanceof Eagle) {
				((Eagle)a).flying();
			}else if(a instanceof Tiger) {
				((Tiger)a).hunting();
			}
			//animals[i].readBook(); //
			
			
		}
	}
}
