package day0210.oop.interfaceex;

public class InterfaceTest2 implements Inter3 {

	@Override
	public int getA() {
		return A;
	}

	@Override
	public int getData() {
		return A+100;
	}

	public static void main(String[] args) {
		InterfaceTest2 it2 = new InterfaceTest2();
		Inter1 i1 = it2;
		Inter2 i2 = it2;
		Inter3 i3 = it2;
		
		System.out.println(i1.getA());
		System.out.println(i2.getA());
		//i2.getData(); - error Inter2로는 getA()(상속받은것)만 쓸수있다.
		System.out.println(i3.getData());
	}

}
