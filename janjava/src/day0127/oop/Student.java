package day0127.oop;
//학번 이름 학년 주소 학생정보 보기
public class Student {
	
	int sId;
	String name;
	int grade;
	String address;
	
	void showInfo() {
		System.out.printf("%d학년 %s학생의 주소는 %s입니다.\n", grade, name, address);
		
	}
	

}
