package day0208.oop.inheritance;

public class Point3D extends Point {
	int z;
	
	
	Point3D(int x, int y, int z){
		//super(); // Point();
		super(x,y);//super의 멤버가 초기화 되야하기 때문에 무조건 super()가 호출됨
		this.z = z;//sub멤버는 sub에서 초기화
	}
	String getLocation() {
		return super.getLocation()+", z: "+z;
	}
	

}
