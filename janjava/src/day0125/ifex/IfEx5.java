package day0125.ifex;

public class IfEx5 {

	public static void main(String[] args) {

		int num = (int)(Math.random()*6+1);
		
		//1 => "1번이 나왔습니다."
		//2 => "2번이 나왔습니다."
		//3 => "3번이 나왔습니다."
		//4 => "4번이 나왔습니다."
		//5 => "5번이 나왔습니다."
		//6 => "6번이 나왔습니다."
		
		if(num == 1) {
			System.out.println("1번이 나왔습니다.");
		}else if(num == 2) {
			System.out.println("2번이 나왔습니다.");
		}else if(num == 3) {
			System.out.println("3번이 나왔습니다.");
		}else if(num == 4) {
			System.out.println("4번이 나왔습니다.");
		}else if(num == 5) {
			System.out.println("5번이 나왔습니다.");
		}else {
			System.out.println("6번이 나왔습니다.");
		}
		

	}

}
