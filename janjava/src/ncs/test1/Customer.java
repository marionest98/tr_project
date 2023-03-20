package ncs.test1;

public class Customer {
	private int money = 10000;
	private int point;

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	void order(Food f) {
		if (money < f.getPrice()) {
			System.out.println("주문 불가");
		} else {
			System.out.println(f.getName() + "을/를 주문하셨습니다.");
			money -= f.getPrice();
			point += f.getPoint();
		}
	}
}
