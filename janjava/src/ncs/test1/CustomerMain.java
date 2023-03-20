package ncs.test1;

public class CustomerMain {
	public static void main(String[] args) {
		Customer b = new Customer();
		Noodle nd = new Noodle();
		Rice rc = new Rice();
		// Customer의 order 메서드를 이용해서 Noodle주문
		b.order(nd);
		// Customer의 order 메서드를 이용해서 Rice주문
		b.order(rc);
		// Customer의 현재 남은 돈 출력
		System.out.println("현재 남은 돈은 " + b.getMoney() + "원 입니다.");
		//// Customer의 포인트 출력
		System.out.println("현재 보너스 점수는 " + b.getPoint() + "점 입니다.");
		
	}
}
