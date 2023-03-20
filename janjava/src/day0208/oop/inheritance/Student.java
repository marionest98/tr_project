package day0208.oop.inheritance;

public class Student {
	
	String sid;
	String name;
	Score score;//포함시킴
	
	public Student() {}
	
	public Student(String sid, String name, Score score) {
		this.sid = sid;
		this.name = name;
		this.score = score;
	}
}
