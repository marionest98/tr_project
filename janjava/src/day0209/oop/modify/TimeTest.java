package day0209.oop.modify;

public class TimeTest {

	public static void main(String[] args) {
		Time t = new Time(12, 6);
		//t.hour = 13;
		t.setHour(25);
		System.out.println(t.getHour());

	}

}
