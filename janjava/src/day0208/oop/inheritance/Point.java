package day0208.oop.inheritance;

public class Point extends Object {
	int x;
	int y;
	
	public Point() {
		this(0,0);		
	}
	
	public Point(int x, int y) {
		super();// Object();
		this.x = x;//super의 멤버는 super에서 초기화
		this.y = y;
	}
	String getLocation() {
		return "x: "+x+", y: "+y;
	}
	

}
