package day0209.oop.modify;

public class OrderTest {
	public static void main(String[] args) {
		ValueObjectEx vo1 = new ValueObjectEx("한솥", "치킨도시락", 1);
		System.out.println(vo1.getFood()+vo1.getQuantity()+"개 주문");
		
		//vo1.quantity = 10;//변경불가
		ValueObjectEx vo2 = new ValueObjectEx("한솥", "돈치고기고기", 2);
		System.out.println(vo2.getFood()+vo2.getQuantity()+"개 주문");
	}
}
