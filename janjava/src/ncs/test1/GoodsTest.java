package ncs.test1;

import java.util.Scanner;

public class GoodsTest {

	public static void main(String[] args) {
		System.out.print("다음 항목의 값을 입력하시오.\n상품명 : ");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();// 공백 있을시
		System.out.print("가격 : ");
		int price = sc.nextInt();
		System.out.print("수량 : ");
		int quantity = sc.nextInt();
		System.out.println();
		System.out.println("입력된 결과는 다음과 같습니다.");
		Goods gs = new Goods(name, price, quantity);
		System.out.println(gs);// 참조변수 출력시 toString()호출, 리턴값 출력
		System.out.println("총 구매 가격 : " + gs.getPrice() * gs.getQuantity() + " 원");
	}
}
