package day0127.oop;

//학번 1, 이름 "김자바", 학년 3, 주소"서울시 종로구"인 학생을 만들어주세요
//학번 2, 이름 "이자바", 학년 2, 주소"서울시 중구"인 학생을 만들어주세요
public class StudentMain {

	public static void main(String[] args) {
		Student s1;
		s1 = new Student();

		s1.sId = 1;
		s1.name = "김자바";
		s1.grade = 3;
		s1.address = "서울시 종로구";

		s1.showInfo();

		Student s2 = new Student();

		s2.sId = 2;
		s2.name = "이자바";
		s2.grade = 2;
		s2.address = "서울시 중구";

		s2.showInfo();

	}

}
