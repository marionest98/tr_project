package spring.di;

public class Fooo {
	Bar bar;
	
	//look up ,메서드
	public Bar getBar() {
		return null;
	}
	public void doFooo() {
		System.out.println("Fooo.doFooo() 실행");
		bar = getBar();
		bar.doBar();
	}
	public void start() {
		System.out.println("Fooo.start() 초기화 메서드");
	}
	public void stop() {
		System.out.println("Fooo.stop() 소멸 메서드");
	}
}
