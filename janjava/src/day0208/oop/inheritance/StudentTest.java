package day0208.oop.inheritance;

public class StudentTest {

	public static void main(String[] args) {
		Score s = new Score("국어", 100);
		Student st1 = new Student("1", "김자바", s);

		System.out.printf("학번 : %s 이름 : %s 과목 : %s 점수 : %d\n", st1.sid, st1.name, st1.score.subject, st1.score.point);

		Student st2 = new Student("2", "이자바", new Score("수학", 80));

		System.out.printf("학번 : %s 이름 : %s 과목 : %s 점수 : %d\n", st2.sid, st2.name, st2.score.subject, st2.score.point);

	}

}
