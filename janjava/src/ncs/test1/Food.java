package ncs.test1;

public class Food {
	private int price;
	private int point;

	Food(int price) {
		this.price = price;
		point = price / 10;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public String getName() {
		return "음식 이름";
	}
}
