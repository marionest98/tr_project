package day0120.test.variable;

public class MyInfo {

	public static void main(String[] args) {
		String name = "홍길동";
		int age = 0;
		String mbti = "몰?루";
		String email = "mail@mail.com";
		
		System.out.println("제 이름은 " + name + "이고 나이는 " + age + "입니다.\nMBTI는 " + mbti +
				           "이며 email주소는 " + email + "입니다.");
		//\n은 줄바꾸기
		
		System.out.printf("제 이름은 %s이고 나이는 %d입니다. \nMBTI는 %s이며 email주소는 %s입니다.", 
				          name, age, mbti, email);


	}

}
