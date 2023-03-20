package day0209.oop.example;

public class StudentScoreTest {

	public static void main(String[] args) {
		StudentScore ss = new StudentScore("홍길동", 1, 1, 100, 70, 70);
		
		//System.out.println("이름: "+ss.name);
		//System.out.println("총점 : "+ss.getTotal());
		//System.out.println("평균 : "+(int)ss.getAverage());
		System.out.println(ss.toString());
	}

}
