package day0210.oop.interfaceex;

public interface Inter3 extends Inter1, Inter2 {
	//int getA();똑같은 추상메서드 상속시 하나로 인식한다. 
	int getData();
	default int add(int i, int j) {
		return A + 1;
	}
}
