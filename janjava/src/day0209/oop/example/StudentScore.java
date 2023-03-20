package day0209.oop.example;

public class StudentScore {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	
	public StudentScore() {}
	public StudentScore(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	int getTotal() {
		return kor+eng+math;
	}
	double getAverage() {
		return getTotal()/3.0;
	}
	public String toString() {
		return "이름 : "+name+"\n총점 : " + getTotal() + "\n평균 : " + getAverage();
	}
	
	
	
	
	

}
