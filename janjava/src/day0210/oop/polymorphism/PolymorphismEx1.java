package day0210.oop.polymorphism;

class Product {
	int price;
	int bonus;

	public Product(int price, int bonus) {
		this.price = price;
		this.bonus = bonus;
	}

}

class Tv extends Product {
	Tv() {
		super(200, 20);
	}

	@Override
	public String toString() {
		return "Tv";
	}
	
}

class Com extends Product{
	public Com() {
		super(100, 10);
	}

	@Override
	public String toString() {
		return "Com";
	}
	
}

class Buyer{
	
	int money = 1000;
	int bonus = 0;
	
	public void buy(Product p) {
		if(p.price > money) {
			System.out.println("잔액 부족");
			return;
		}
		money -= p.price;
		bonus += p.bonus;
		System.out.println(p+"를 구입.");
		//참조형 + String => 참조형.toString() + String
		//다형성으로 객체를 다루는 경우 -> 실제 인스턴스 타입에 있는 오버라이딩 된 메서드 호출
	}
}

public class PolymorphismEx1 {

	public static void main(String[] args) {
		Tv tv = new Tv();
		Com com = new Com();
		Buyer b = new Buyer();
		
		b.buy(com);
		b.buy(tv);
		
		

	}

}
